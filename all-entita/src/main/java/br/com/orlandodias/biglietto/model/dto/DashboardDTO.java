package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.orlandodias.biglietto.model.SisUsu;

public class DashboardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private UsuariosCadastradosDTO usuariosCadastradosDTO;
	private SistemasLicenciadosDTO sistemasLicenciadosDTO;
	private Integer qtUsuLog;
	private Integer qtSss;
	private Integer qtMaxUsuarios;
	private Integer qtMaxSessoes;
	private ArrayList<SisUsu> usuariosLogados;
	private ArrayList<HistoricoSessoesDTO> historicoSessoes;

	public DashboardDTO() {
		super();
	}

	public UsuariosCadastradosDTO getUsuariosCadastradosDTO() {
		return usuariosCadastradosDTO;
	}

	public void setUsuariosCadastradosDTO(UsuariosCadastradosDTO usuariosCadastradosDTO) {
		this.usuariosCadastradosDTO = usuariosCadastradosDTO;
	}

	public SistemasLicenciadosDTO getSistemasLicenciadosDTO() {
		return this.sistemasLicenciadosDTO;
	}

	public void setSistemasLicenciadosDTO(SistemasLicenciadosDTO sistemasLicenciadosDTO) {
		this.sistemasLicenciadosDTO = sistemasLicenciadosDTO;
	}

	public Integer getQtUsuLog() {
		return qtUsuLog;
	}

	public void setQtUsuLog(Integer qtUsuLog) {
		this.qtUsuLog = qtUsuLog;
	}

	public ArrayList<SisUsu> getUsuariosLogados() {
		return usuariosLogados;
	}

	public void setUsuariosLogados(ArrayList<SisUsu> usuariosLogados) {
		this.usuariosLogados = usuariosLogados;
	}

	public Integer getQtSss() {
		return qtSss;
	}

	public void setQtSss(Integer qtSss) {
		this.qtSss = qtSss;
	}

	public ArrayList<HistoricoSessoesDTO> getHistoricoSessoes() {
		return historicoSessoes;
	}

	public void setHistoricoSessoes(ArrayList<HistoricoSessoesDTO> historicoSessoes) {
		this.historicoSessoes = historicoSessoes;
	}

	public Integer getQtMaxUsuarios() {
		qtMaxUsuarios = 0;
		for (HistoricoSessoesDTO hs : this.historicoSessoes) {
			for (int i = 1; i < hs.getUsuarios().length; i++) {
				if (qtMaxUsuarios < hs.getUsuarios()[i]) {
					qtMaxUsuarios = hs.getUsuarios()[i];
				}
			}
		}
		return qtMaxUsuarios;
	}

	public void setQtMaxUsuarios(Integer qtMaxUsuarios) {
		this.qtMaxUsuarios = qtMaxUsuarios;
	}

	public Integer getQtMaxSessoes() {
		qtMaxSessoes = 0;
		for (HistoricoSessoesDTO hs : this.historicoSessoes) {
			for (int i = 1; i < hs.getSessoes().length; i++) {
				if (qtMaxSessoes < hs.getSessoes()[i]) {
					qtMaxSessoes = hs.getSessoes()[i];
				}
			}
		}
		return qtMaxSessoes;
	}

	public void setQtMaxSessoes(Integer qtMaxSessoes) {
		this.qtMaxSessoes = qtMaxSessoes;
	}

}
