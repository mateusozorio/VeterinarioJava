package org.example;
import java.util.ArrayList;
import java.util.List;

public class ServicoAnimal {

    static List<Animal> listaAnimal = new ArrayList<>();

    //VALIDAR ANIMAL
    public static int validarAnimal(Animal animal){
        if(animal.getIdAnimal() == 0){
            return 0;
        }
        if(animal.getDescricaoAnimal() == null || animal.getDescricaoAnimal().trim().isEmpty()){
            return 0;
        }
        if(animal.getRacaAnimal() == null || animal.getRacaAnimal().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

    // CADASTRO DE ANIMAL
    public static int cadastrarAnimal(Animal animal) {
        // Verificar se a ID já existe
        for (Animal a : listaAnimal) {
            if (a.getIdAnimal() == animal.getIdAnimal()) {
                System.out.println("Erro: Já existe um animal cadastrado com a mesma ID.");
                return 0; // Retorna 0 para indicar erro
            }
        }

        try {
            listaAnimal.add(animal);
            return 1; // Retorna 1 para indicar sucesso
        } catch (Exception e) {
            return 0; // Retorna 0 para indicar erro
        }
    }

    //EDIÇÃO DE ANIMAIS
    public static boolean editarAnimal(Animal animal){
        try{
            if(validarAnimal(animal) == 1){
                //EDIÇÃO PRODUTO
                for(Animal p : listaAnimal){
                    if(p.getIdAnimal() == animal.getIdAnimal()){
                        p.setDescricaoAnimal(animal.getDescricaoAnimal());
                        p.setRacaAnimal(animal.getRacaAnimal());
                        return true;
                    }
                }
                return false;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    //EXCLUSÃO DE ANIMAL
    public static boolean excluirAnimal(int idAnimal){
        for(int i = 0; i < listaAnimal.size(); i ++){
            if(listaAnimal.get(i).getIdAnimal() == idAnimal){
                listaAnimal.remove(i);
                return true;
            }
        }
        return false;
    }

    //CONSULTAR ANIMAL
    public static Animal consultarAnimal(int idAnimal){
        Animal animal = null;
        for(Animal p : listaAnimal){
            if(p.getIdAnimal() == idAnimal){
                animal = p;
                break;
            }
        }
        return animal;
    }
    //LISTAR TODOS OS ANIMAIS
    public static void listarTodosAnimais() {
        System.out.println("Lista de todos os animais cadastrados:");
        if (listaAnimal.isEmpty()) {
            System.out.println("Nenhum animal cadastrado ainda.");
        } else {
            for (Animal animal : listaAnimal) {
                System.out.println("ID: " + animal.getIdAnimal() + ", Descrição: " + animal.getDescricaoAnimal() + ", Raça: " + animal.getRacaAnimal());
            }
        }
    }
}

