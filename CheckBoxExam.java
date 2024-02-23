package P09;


class CheckBox{
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}
//
//class BackgroundChangeListener implements OnSelectListener{
//	public void onSelect() {
//		System.out.println("배경이 변경합니다");
//	}
//}

public class CheckBoxExam {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("배경을 바꿔줍니다.");
				
			}
		});
		checkBox.select();
	}
}

