package org.example;

import java.io.*;
import java.util.List;

public class SerializadorFilme {
    public static void salvarFilmes(List<Filme> filmes, String caminhoArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
            oos.writeObject(filmes);
        }
    }

    public static List<Filme> carregarFilmes(String caminhoArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            return (List<Filme>) ois.readObject();
        }
    }
}
