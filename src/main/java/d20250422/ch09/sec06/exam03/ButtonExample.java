package d20250422.ch09.sec06.exam03;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());
        // Ok 버튼 클릭하기
        btnOk.click();
    }
}
