package anonymousTest;

public class Nike {
	public void register(Form form) {
		for (int i = 0; i < form.getMenu().length; i++) {
			System.out.println(form.getMenu()[i]);
		}
		
		form.sell("축구공");
	}
}
