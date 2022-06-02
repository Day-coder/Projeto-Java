package com.letscode.produtos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Produto implements Serializable {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

private String nome;

private int quantidade;

private double valor;


}
