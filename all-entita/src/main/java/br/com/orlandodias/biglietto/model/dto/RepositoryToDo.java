package br.com.orlandodias.biglietto.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import br.com.orlandodias.allutils.model.ToDo;

public class RepositoryToDo implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<ToDo> toDoList = new ArrayList<>();

	@SuppressWarnings("deprecation")
	public RepositoryToDo() {
		super();
		ToDo myToDo = new ToDo();
		myToDo.setActivity("Ajuste no gráfico do DashBoard");
		myToDo.setDescription("Colocar histórico de usuários logados na última semana");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 29));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Título do Dashboard as vezes nao aparece");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_ERROR);
		myToDo.setOpen(new Date(2016, Calendar.SEPTEMBER, 30));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Trocar estratégia do título da página");
		myToDo.setDescription("Eliminar pesquisa");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 30));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Fazer funcionar no MySql");
		myToDo.setDescription("Transformar em Permiso");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Escolha da língua no login");
		myToDo.setDescription("Implementar o LocaleChooser");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("User messages");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("User profile");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Limpar código de exemplo");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 23));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 29));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Internacionalizar dashBoard e Login");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Implementar Esqueci minha Senha");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Ajuste último cartão do dashBoard");
		myToDo.setDescription("Colocar sessões abertas no dia");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Ajuste no Login");
		myToDo.setDescription(
				"1) Acessar funcao do BD. 2) Fechar todas as sessões anteriores que porventura estejam abertas");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Ajuste no Logoff");
		myToDo.setDescription(
				"1) Acessar funcao do BD. 2) Fechar todas as sessões anteriores que porventura estejam abertas");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_MEDIUM);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 21));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Cadastro de Usuário");
		myToDo.setDescription("Montar CRUD de Usuário");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_HIGH);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 23));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Associação de Função ao Perfil");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_HIGH);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 22));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Associar Botão ao Perfil");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_HIGH);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 22));
		this.toDoList.add(myToDo);

		myToDo = new ToDo();
		myToDo.setActivity("Associar Usuário ao Perfil");
		myToDo.setDescription("");
		myToDo.setArea(ToDo.AREA_CODE);
		myToDo.setPriority(ToDo.PRIORTY_HIGH);
		myToDo.setType(ToDo.TYPE_PROJECT);
		myToDo.setOpen(new Date(2016, Calendar.AUGUST, 21));
		myToDo.setClose(new Date(2016, Calendar.AUGUST, 23));
		this.toDoList.add(myToDo);
	}

	public ArrayList<ToDo> getToDoList() {
		return toDoList;
	}

	public void setToDoList(ArrayList<ToDo> toDoList) {
		this.toDoList = toDoList;
	}

}
