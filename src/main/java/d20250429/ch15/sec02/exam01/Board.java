package d20250429.ch15.sec02.exam01;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // 기본생성자
@Data // getter, setter
public class Board {
    private String subject;
    private String content;
    private String writer;
}
