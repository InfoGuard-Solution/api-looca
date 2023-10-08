package com.github.britooo.looca.api.util;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.System.*;

public class Teste {
    public static void main(String[] args) {
        Looca looca = new Looca();
        Processador processador = new Processador();
        Temperatura temperatura = new Temperatura();
        DiscoGrupo disco = new DiscoGrupo();
        Conversor conversor = new Conversor();


        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                out.println("------------------------------------------------");

                //Marca CPU
                out.println("Marca: "+processador.getFabricante());
                //Nome CPU
                out.println("Nome: "+looca.getProcessador().getIdentificador());

                //ID CPU
                out.println("ID: "+looca.getProcessador().getId()+"\n");

                //Status CPU
                out.println(String.format("CPU:\n" +
                        "Atividade CPU: %.1f\n" +
                            //executar o OpenHardwareMonitor para TEMPERATURA funcionar
                        "Temperatura CPU: %.1f",looca.getProcessador().getUso(),temperatura.getTemperatura()));

                out.println("------------------------------------------------");

                //Informações Memória RAM
                out.println(looca.getMemoria());

                 out.println("------------------------------------------------");

                Disco
                out.println("DISCO:");
                System.out.println("Tamanho Total: "+Conversor.formatarBytes(disco.getTamanhoTotal()));
                //out.println(disco.getVolumes());
                
                //Informações da Rede
                //out.println(looca.getRede());
                //out.println(looca.getRede().getGrupoDeInterfaces().getInterfaces());
                //out.println(looca.getRede().getParametros().getServidoresDns());

            }
        }, 0, 3000);






}
}
