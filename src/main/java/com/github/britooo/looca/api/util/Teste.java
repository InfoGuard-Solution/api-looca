package com.github.britooo.looca.api.util;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Teste {
    public static void main(String[] args) {
        Looca looca = new Looca();
        looca.getGrupoDeProcessos();

        Processador processador = new Processador();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(looca.getProcessador());
            }
        }, 0, 2000);





}
}
