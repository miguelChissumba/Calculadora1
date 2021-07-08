package mz.co.miguelchissumba.calculadorController;

import java.text.Normalizer.Form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mz.co.miguelchissumba.model.adicao.Adicao;
import mz.co.miguelchissumba.model.calculadora.Calculadora;
import mz.co.miguelchissumba.model.divisao.Divisao;
import mz.co.miguelchissumba.model.multiplicacao.Multiplicaocao;
import mz.co.miguelchissumba.model.subtracao.Subtracao;

@Controller
@RequestMapping("/calculadora")
public class calculadoraController {

	
	@RequestMapping(value = { "/" , ""  } , method = RequestMethod.GET)
	public ModelAndView carregaForm(Model model){
		model.addAttribute("calculadora", new Calculadora());
		return new ModelAndView("calculadora/calculadora");
	}

	@RequestMapping(value = { "/" , "" } , method = RequestMethod.POST)
	public ModelAndView recebeForm(@ModelAttribute("calculadora") Calculadora calculadora, Model model){
		long resultado=0;
		
		if(calculadora.getOperator()=='*') {
			Multiplicaocao m= new Multiplicaocao();
			m.operador(calculadora.getOperator());
			resultado=m.resultado(calculadora.getValorA(), calculadora.getValorB());
		}else {
			if(calculadora.getOperator()=='/') {
				Divisao d= new Divisao();
				d.operador(calculadora.getOperator());
				resultado=d.resultado(calculadora.getValorA(), calculadora.getValorB());
			}
		}if(calculadora.getOperator()=='+') {
			Adicao a= new Adicao();
			a.operador(calculadora.getOperator());
			resultado=a.resultado(calculadora.getValorA(), calculadora.getValorB());
		}else {
			if(calculadora.getOperator()=='-') {
				Subtracao s= new Subtracao();
				s.operador(calculadora.getOperator());
				resultado=s.resultado(calculadora.getValorA(), calculadora.getValorB());
			}
		}
		
		model.addAttribute("msg", "O resultado e' : "+resultado );
		return new ModelAndView("forcalculadoram/calculadora");
	}
	
	
}
