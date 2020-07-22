package br.com.orlandodias.allutils.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class BasicEnd implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deLgr;
	private String nuEnd;
	private String deCpl;
	private String deBrr;
	private String deCid;
	private String cdUfx;
	private Integer cdCep;
	private String deRefLoc;

}
