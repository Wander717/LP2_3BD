package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.MsgAudio;
import edu.fatec.lp2.exercicio1.mensagem.MsgFoto;
import edu.fatec.lp2.exercicio1.mensagem.MsgTexto;
import edu.fatec.lp2.exercicio1.modelo.Contatinho;
import edu.fatec.lp2.exercicio1.modelo.Whatsapp;

public class App {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp(10, 50);

        Contatinho ana = new Contatinho("Ana", "(11) 90000-1111");
        Contatinho pedro = new Contatinho("Pedro", "(11) 97777-2222");
        whatsapp.adicionarContato(ana);
        whatsapp.adicionarContato(pedro);

        whatsapp.adicionarMensagem(new MsgTexto(ana).sendMessage("Oi, Ana! Tudo bem?"));
        whatsapp.adicionarMensagem(new MsgAudio(pedro, 42).sendMessage("audio_001.ogg"));
        whatsapp.adicionarMensagem(new MsgFoto(ana, 2048).sendMessage("praia.jpg"));

        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
