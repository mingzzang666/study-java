package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.ReplyVO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가
	
//	INSERT INTO tbl_reply
//	(reply_content, reply_status, created_date, updated_date, post_id, member_id)
//	VALUES('', 'enable', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, 0);

	public void insert(ReplyVO replyVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_reply ");
		stringBuilder.append("(reply_content, post_id, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert(ReplyVO) SQL 오류");
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	수정
	public void update(ReplyVO replyVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_reply ");
		stringBuilder.append("set reply_content = ?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update(ReplyVO) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	삭제(soft-delete)
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_reply ");
		stringBuilder.append("set reply_status = 'disable' ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	삭제(hard-delete)
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("delete from tbl_reply ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	조회
	public ReplyDTO selectOne(Long id) {
		ReplyDTO replyDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("r.id, r.reply_content, m.member_name, r.created_date, r.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_reply r ");
		stringBuilder.append("on m.id = r.member_id and r.id = ? and r.reply_status = 'enable'");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				replyDTO = new ReplyDTO();

				replyDTO.setId(resultSet.getLong("id"));
				replyDTO.setReplyContent(resultSet.getString("reply_content"));
				replyDTO.setMemberName(resultSet.getString("member_name"));
				replyDTO.setCreatedDate(resultSet.getString("created_date"));
				replyDTO.setUpdatedDate(resultSet.getString("updated_date"));
			}

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return replyDTO;
	}
	
//	전체 조회
	public ArrayList<PostDTO> selectAll() {
		ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
		PostDTO postDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("p.id, p.post_title, p.post_content, p.post_read_count, m.member_name, p.created_date, p.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_post p ");
		stringBuilder.append("on m.id = p.member_id and p.post_status = 'enable'");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				postDTO = new PostDTO();

				postDTO.setId(resultSet.getLong("id"));
				postDTO.setPostTitle(resultSet.getString("post_title"));
				postDTO.setPostContent(resultSet.getString("post_content"));
				postDTO.setPostReadCount(resultSet.getInt("post_read_count"));
				postDTO.setMemberName(resultSet.getString("member_name"));
				postDTO.setCreatedDate(resultSet.getString("created_date"));
				postDTO.setUpdatedDate(resultSet.getString("updated_date"));
				
				posts.add(postDTO);
			}

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return posts;
	}
}
























