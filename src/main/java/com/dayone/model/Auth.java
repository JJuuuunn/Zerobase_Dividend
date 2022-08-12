package com.dayone.model;

import com.dayone.persist.entity.MemberEntity;
import lombok.Data;

import java.util.List;

public class Auth {

    @Data
    public static class SighIn {
        private String username;
        private String password;
    }

    @Data
    public static class SighUp {
        private String username;
        private String password;
//        private List<String> roles;
        private String role;//

        public MemberEntity toEntity() {
            return MemberEntity.builder()
                    .username(this.username)
                    .password(this.password)
//                    .roles(this.roles)
                    .role(this.role)//
                    .build();
        }
    }
}
