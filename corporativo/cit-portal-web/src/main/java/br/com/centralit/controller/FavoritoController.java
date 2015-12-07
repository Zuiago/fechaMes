package br.com.centralit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.centralit.api.service.FavoritoService;
import br.com.centralit.framework.controller.GenericController;
import br.com.centralit.framework.model.Favorito;

/**
 * <p>
 * <img src="http://centralit.com.br/images/logo_central.png">
 * </p>
 * 
 * <p>
 * <b>Company: </b> Central IT - Governança Corporativa -
 * </p>
 * 
 * <p>
 * <b>Title: </b>
 * </p>
 * 
 * <p>
 * <b>Description: </b>
 * </p>
 * 
 * <p>
 * <b>Iniciativa(s):</b> <a href="LINK_PORTAL">NUMERO_INICIATIVA</a>
 * </p>
 * 
 * <p>
 * <b>Regra(s) de negócio:</b> <a href="LINK_PORTAL">NUMERO_REGRA_DE_NEGOCIO</a>
 * </p>
 * 
 * @since 12/02/2015 - 09:09:59
 * 
 * @version 1.0.0
 * 
 * @author iago.almeida
 * 
 */
@Controller
@RequestMapping("/rest/favorito")
public class FavoritoController extends GenericController<Favorito> {

	@Autowired
	public FavoritoController( FavoritoService favoritoService ) {

		super(favoritoService);

	}

}
