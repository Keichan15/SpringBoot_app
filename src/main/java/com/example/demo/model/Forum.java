package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// @Data:各フィールドのsetter・getterを自動生成
@Data
@Entity
// @Table:対応するテーブル
@Table(name = "forums")
public class Forum {
	@Id
	// @GeneratedValue:idは自動生成されることを明記
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column:テーブルのどのカラムと一致するか
	@Column(name = "id")
	private Integer id;
	@Column(name = "title")
	private String title;
	@Column(name = "body")
	private String body;
}