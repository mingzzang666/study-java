package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.member.MemberGender;

public class MemberDAO {
//	내가 설정한 RDB의 연결 객체
	private Connection connection;
//	내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private PreparedStatement preparedStatement;
//	조회 결과를 담아줄 객체
	private ResultSet resultSet;
	
//	추가
	public void insert(MemberVO memberVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
//stringBuilder.append를 사용하여 문자열을 이어줌
		stringBuilder.append("insert into tbl_member ");
		stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");
		
//쿼리 변수에 이어진 문자열을 지정한 형식으로 넣어줌
		query = stringBuilder.toString();
		
//		try~catch 문을 사용하여
		try {
//			DB 연결 객체를 받아옴
			connection = DBConnecter.getConnection();
//			SQL을 컴파일하여 실행 준비함.
			preparedStatement = connection.prepareStatement(query);
//			파라미터 값을 넣어줌
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberGender().getValue());
			
//			executeUpdate를 사용하여 DB에 정보를 추가해줌
			preparedStatement.executeUpdate();
			
//			DB 관련 오류(문법 등)를 잡아줌
		} catch (SQLException e) {
			System.out.println("insert(MemberVO) SQL 오류");
			e.printStackTrace();
			
//			그 외 오류를 잡아줌
		} catch (Exception e) {
			e.printStackTrace();
			
			
//			DB 연결과 명령 객체를 닫기 위해 무조건 실행되는 finally 실행
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
//				닫는 중에 오류가 나도 RuntimeException에 던져서 실행되도록 설정
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	수정
	
//	업데이트를 해주는 메소드 생성
	public void update(MemberVO memberVO) {
//		쿼리를 담아줄 변수 생성
		String query = null;
//		문자열을 관리하기 위해 stringbuilder 호출
		StringBuilder stringBuilder = new StringBuilder();
		
//		update를 수행하기 위한 문자열을 stringBuilder.append로 설정
		stringBuilder.append("update tbl_member ");
//		어떤 값을 수정할지 모르기때문에 모든 값을 담아줌
		stringBuilder.append("set member_password=?, member_name=?, member_age=?, member_gender=?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");
		
//		query 변수에 위에서 나열한 문자열을 담아줌
		query = stringBuilder.toString();
		
		
//		try~catch를 사용하여
		try {
//			DB 연결 객체를 받아옴
			connection = DBConnecter.getConnection();
			
//			실행 준비
			preparedStatement = connection.prepareStatement(query);
			
//			파라미터에 수정할 값을 넣어줌
			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setInt(3, memberVO.getMemberAge());
			preparedStatement.setString(4, memberVO.getMemberGender().getValue());
			preparedStatement.setLong(5, memberVO.getId());
			
//			executeUpdate를 사용하여 DB에 담긴 정보를 수정
			preparedStatement.executeUpdate();
			
//		DB 관련 오류를 잡아줌
		} catch (SQLException e) {
			System.out.println("update(MemberVO) SQL문 오류");
			e.printStackTrace();
			
//			그 외 오류를 잡아줌
		} catch (Exception e) {
			e.printStackTrace();
//			DB 연결과 명령 객체를 닫기 위해 무조건 실행되는 finally 실행		
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
//				닫는 중에 오류가 나도 RuntimeException에 던져서 실행되도록 설정				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	삭제
	
//	soft-delete를 실행하기 위해 메소드 선언
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update tbl_member ");
		
//		member_status 변수를 이용하여 삭제할 데이터만 disable로 바꿔줌(데이터를 실제로 삭제하지 않아 복구 가능)
		stringBuilder.append("set member_status = disable ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
//			파라미터에 값을 입력하여 첫번째 ? 에 전달받은 id 값을 disable로 설정
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("deleteSoft(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	hard-delete를 실행하기 위한 메소드 선언
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		
//		delete문을 사용하여 실제 데이터 삭제
		stringBuilder.append("delete from tbl_member ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	조회
	
//	 회원테이블(tbl_member)에서 id에 해당하는 회원 정보 조회, Optional<memberVO>로 반환
	public Optional<MemberVO> selectOne(Long id) {
		
//		회원 정보를 담을 memberVO 객체 선언
		MemberVO memberVO = null;
//		쿼리문을 담을 변수 선언
		String query = null;

//		문자열을 이어줄 stringBuilder 호출
		StringBuilder stringBuilder = new StringBuilder();
		
//		stringBuilder.append로 입력할 문자열을 넣어줌
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member ");
		stringBuilder.append("where id = ?");
		
//		쿼리 변수에 입력한 문자열을 넣어줌
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement =  connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			
//			resultSet.next가 트루일 경우
			if(resultSet.next()) {
				
				MemberGender memberGender = null;
				
//				memberVO 객체를 새로 만들고
				memberVO = new MemberVO();
//				각 값을 꺼내서 객체에 넣음 (단일 회원 목록을 가져옴)
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));
			}
			
		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return Optional.ofNullable(memberVO);
	}
	
//	전체 조회
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		
//		전체 회원 목록을 가져옴
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement =  connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				MemberGender memberGender = null;
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));
				
				members.add(memberVO);
			}
			
		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return members;
	}
}




















