import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import com.github.britooo.looca.api.util.Conversor;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Looca looca = new Looca();
        Conversor conversor = new Conversor();
        DiscoUso discoUso = new DiscoUso();

        Processador processador = new Processador();
        Temperatura temperatura = new Temperatura();
        DiscoGrupo disco = new DiscoGrupo();

                out.println("------------------------------------------------");

                //Marca CPU
                out.println("Marca: "+processador.getFabricante());
                //Nome CPU
                out.println("Nome: "+looca.getProcessador().getIdentificador());
                //ID CPU
                out.println("ID: "+looca.getProcessador().getId()+"\n");
                //Status CPU
//                out.printf("CPU:\n" +
//                        "Atividade CPU: %.1f\n" +
//                        //executar o OpenHardwareMonitor para TEMPERATURA funcionar
//                        "Temperatura CPU: %.1f%n",looca.getProcessador().getUso(),temperatura.getTemperatura());
//
//                out.println("------------------------------------------------");

                //Informações Memória RAM
                out.println(looca.getMemoria());

                out.println("------------------------------------------------");

                //Disco
                out.println("DISCO:");
                //out.println("Tamanho Total: " + Conversor.formatarBytes(disco.getTamanhoTotal()));
                out.println(disco.getTamanhoTotal());

                //NÃO ESTÁ FUNCIONANDO
                //out.println(discoUso);


                //out.println(disco.getVolumes());

                //Informações da Rede
                //out.println(looca.getRede());
                //out.println(looca.getRede().getGrupoDeInterfaces().getInterfaces());
                //out.println(looca.getRede().getParametros().getServidoresDns());


    }
}