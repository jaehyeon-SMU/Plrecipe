package com.sixcandoit.plrecipe_member.feature.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterDTO {
    private String memberEmail;
    private String password;
    private String memberName;
    private String memberNickname;
    private String memberNumber;
}
