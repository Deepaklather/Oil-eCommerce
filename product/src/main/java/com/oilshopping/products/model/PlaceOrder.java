package com.oilshopping.products.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.hibernate.annotations.NotFound;
import org.springframework.context.annotation.Primary;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Place_Order")
@NoArgsConstructor
@AllArgsConstructor
public class PlaceOrder implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;

	@Column(name = "customer_name")
	@NotEmpty
	private String customerName;

	@Column(name = "phone_number")
	@NotEmpty
	private String phoneNumber;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "one_litre_bottles")
	private int oneLitreBottles;

	@Column(name = "two_litre_bottles")
	private int twoLitreBottles;

	@Column(name = "five_litre_bottles")
	private int fiveLitreBottles;

	@Column
	private int tin;

}