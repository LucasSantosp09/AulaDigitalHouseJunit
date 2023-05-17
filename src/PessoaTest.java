import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p1, p2, p3;
    @BeforeEach
    void doBefore (){
        p1 = new Pessoa("Ciro");
        p1.setIdade(LocalDate.of(2016, 1, 18));

        p2 = new Pessoa("Lucas");
        p2.setIdade(LocalDate.of(1997, 8, 19));

        p3 = new Pessoa("Yuri");
        p3.setIdade(LocalDate.of(2015, 8, 12));
    }

    @Test
    void imprimir(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    @Test
    void testaAdicaoLista(){
        p1.adicionarNome(p1);
        p2.adicionarNome(p2);
        p3.adicionarNome(p3);
    }
}