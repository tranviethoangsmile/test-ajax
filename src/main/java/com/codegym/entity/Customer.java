package com.codegym.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String fullName;
    String phoneNumber;
    String email;
    String provinces;
    String provimceId;
    String district;
    String districtId;
    String ward;
    String wardId;

}
