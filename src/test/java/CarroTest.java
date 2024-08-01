import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class CarroTest {
        @Test
        void deveRetornarPrecoCarro() {
            Carro carro = new CarroPadrao(1000.0f);

            assertEquals(1000.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComCorPersonalizada() {
            Carro carro = new CorPersonalizada(new CarroPadrao(1000.0f));

            assertEquals(1100.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComAparelhoDeSom() {
            Carro carro = new AparelhoDeSom(new CarroPadrao(1000.0f));

            assertEquals(1200.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComTetoSolar() {
            Carro carro = new TetoSolar(new CarroPadrao(1000.0f));

            assertEquals(1050.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComCorPersonalizadaMaisAparelhoDeSom() {
            Carro carro = new CorPersonalizada(new AparelhoDeSom(new CarroPadrao(1000.0f)));

            assertEquals(1320.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComCorPersonalizadaMaisTetoSolar() {
            Carro carro = new CorPersonalizada(new TetoSolar(new CarroPadrao(1000.0f)));

            assertEquals(1155.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComAparelhoDeSomMaisTetoSolar() {
            Carro carro = new AparelhoDeSom(new TetoSolar(new CarroPadrao(1000.0f)));

            assertEquals(1260.0f, carro.getPreco());
        }

        @Test
        void deveRetornarPrecoCarroComCorPersonalizadaMaisAparelhoDeSomMaisTetoSolar() {
            Carro carro = new CorPersonalizada(new AparelhoDeSom(new TetoSolar(new CarroPadrao(1000.0f))));

            assertEquals(1386.0f, carro.getPreco());
        }

        @Test
        void deveRetornarEstruturaCarro() {
            Carro carro = new CarroPadrao();

            assertEquals("Carro Padrão", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComCorPersonalziada() {
            Carro carro = new CorPersonalizada(new CarroPadrao());

            assertEquals("Carro Padrão/Cor Personalizada", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComAparelhoDeSom() {
            Carro carro = new AparelhoDeSom(new CarroPadrao());

            assertEquals("Carro Padrão/Aparelho De Som", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComTetoSolar() {
            Carro carro = new TetoSolar(new CarroPadrao());

            assertEquals("Carro Padrão/Teto Solar", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComCorPersonalizadaMaisAparelhoDeSom() {
            Carro carro = new CorPersonalizada(new AparelhoDeSom (new CarroPadrao()));

            assertEquals("Carro Padrão/Aparelho De Som/Cor Personalizada", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComCorPersonalziadaMaisTetoSolar() {
            Carro carro = new CorPersonalizada(new TetoSolar (new CarroPadrao()));

            assertEquals("Carro Padrão/Teto Solar/Cor Personalizada", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComAparelhoDeSomMaisTetoSolar() {
            Carro carro = new AparelhoDeSom(new TetoSolar (new CarroPadrao()));

            assertEquals("Carro Padrão/Teto Solar/Aparelho De Som", carro.getEstrutura());
        }

        @Test
        void deveRetornarEstruturaCarroComCorPersonalizadaMaisAparelhoDeSomMaisTetoSolar() {
            Carro carro = new CorPersonalizada (new AparelhoDeSom(new TetoSolar (new CarroPadrao())));

            assertEquals("Carro Padrão/Teto Solar/Aparelho De Som/Cor Personalizada", carro.getEstrutura());
        }


}
