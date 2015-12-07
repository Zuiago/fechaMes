package br.com.centralit.api.service.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.centralit.framework.exception.CodigoErro;

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
 * @since 17/07/2015 - 09:11:36
 * 
 * @version 1.0.0
 * 
 * @author rogerio.costa
 * 
 */
@Component("parametroSistemaValidator")
public class ParametroSistemaValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return ParametroSistemaValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "chave", CodigoErro.VALIDACAO_CAMPOS.getValue().toString(), "LABEL.CHAVE");

		ValidationUtils.rejectIfEmpty(errors, "valor", CodigoErro.VALIDACAO_CAMPOS.getValue().toString(), "LABEL.TIPO_AVALIACAO_MONETARIA_ESTOQUE");

	}

}
