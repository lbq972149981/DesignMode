package 外观模式_门面模式;

public class Student implements Studentmethds {
	private EnglishMethds em=new EnglishMethds() {
			@Override
			public void speakEnglish() {
				System.out.println("说英语");
			}
		};
	private MathMethds mm = new MathMethds() {
		@Override
		public void 算数() {
			System.out.println("会算数");
		}
	};
	private CodeMethds cm = new CodeMethds() {
		@Override
		public void ACM() {
			System.out.println("会算法");
		}

		@Override
		public void Web() {
			System.out.println("会网站");
		}
	};
	@Override
	public void 技能点() {
		em.speakEnglish();
		mm.算数();
		cm.ACM();
	}
}
