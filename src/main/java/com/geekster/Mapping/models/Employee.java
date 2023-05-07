package com.geekster.Mapping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "fk_user_address-id",referencedColumnName = "addressId")
private Address userAddress;

}
