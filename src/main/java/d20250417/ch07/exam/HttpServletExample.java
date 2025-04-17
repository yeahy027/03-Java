package d20250417.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }

    public static void method(HttpServlet servlet) {
        servlet.service();  // 각 서블릿에 맞는 서비스 메서드 호출
    }
}
