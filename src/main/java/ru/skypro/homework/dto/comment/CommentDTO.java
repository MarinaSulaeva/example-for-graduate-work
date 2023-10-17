package ru.skypro.homework.dto.comment;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDTO {
    Integer pk;
    Integer author;
    String authorImage;
    String authorFirstName;
    //    int createdAt;
    LocalDateTime createdAt;

}
