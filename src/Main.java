import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------Médicos:----------------------------------------------------");
        Medicos jose = new Medicos("2324", "José Da Silva", "Cardiologia", false);
        Medicos maria = new Medicos("1321", "Maria Da Silva", "Endrocnologia", true);
        Medicos carlos = new Medicos("1124", "Carlos José", "Clínico Geral", false);
        Medicos marina = new Medicos("2211", "Marina Santos", "Cardiologia", false);
        Medicos carla = new Medicos("2090", "Carla Maria", "Pediatria", true);
        System.out.println("---------------------------------Medicamentos:-----------------------------------------------------");
        //id
        Date vDipirona = new Date(2025, 05, 11);
        Date vAmoxicilina = new Date(2026, 01, 11);
        Date vAnitta = new Date(2022, 03, 30);
        Date vPantoprazol = new Date(2027, 02, 11);
        Date vLoratadina = new Date(2026, 10, 22);

        Medicamentos dipirona = new Medicamentos(1, "Combate dores", vDipirona, 30, "8 em 8");
        Medicamentos amoxicilina = new Medicamentos(2, "Combate inflamações", vAmoxicilina, 20, "12 em 12");
        Medicamentos anitta = new Medicamentos(1, "Combate verminoses", vAnitta, 10, "8 em 8");
        Medicamentos pantoprazol = new Medicamentos(1, "Combate dores no estômago", vPantoprazol, 30, "8 em 8");
        Medicamentos loratadina = new Medicamentos(1, "Combate alergia", vLoratadina, 30, "8 em 8");


        System.out.println("---------------------------------Planos de Saúde:-----------------------------------------------------");
        Date dI = new Date(2020, 01, 01);
        Date dF = new Date(2030, 12, 31);

        // Arrays Unimed:---------------------------------------------------------------------
        ArrayList procedimentosU = new ArrayList<>();
        procedimentosU.add("Consulta");
        procedimentosU.add("Coleta de Urina");
        procedimentosU.add("Coleta de sangue");
        procedimentosU.add("Consulta de fezes");
        procedimentosU.add("Cirurgia Pediátrica");
        procedimentosU.add("Internação");
        procedimentosU.add("Cirurgia Cardíaca");
        procedimentosU.add("Transporte Aéreo");


        PlanoDeSaude unimed = new PlanoDeSaude("Unimed", dF, procedimentosU); //Objeto Unimed

        // Arrays Bradesco----------------------------------------------------------------------
        ArrayList procedimentosB = new ArrayList<>();
        procedimentosB.add("Consulta");
        procedimentosB.add("Coleta de Urina");
        procedimentosB.add("Coleta de sangue");
        procedimentosB.add("Consulta de fezes");
        procedimentosB.add("Cirurgia Pediátrica");
        procedimentosB.add("Internação");
        procedimentosB.add("Cirurgia Cardíaca");
        procedimentosB.add("Transporte Aéreo");

        PlanoDeSaude saudeBradesco = new PlanoDeSaude("SaúdeBradesco", dF, procedimentosB); //Obj saudeBradesco

        System.out.println("---------------------------------Pacientes:-----------------------------------------------------");
        Date dtNascNatan = new Date(1990, 02, 31);
        ArrayList<String> alNatan = new ArrayList<>();
        alNatan.add("Camarão");
        alNatan.add("Anti-Inflamatório");
        Paciente natan = new Paciente("123.123.333-00", "Natan Alves", "3198323232", "Rua do Frevo 222 centro", "natanalves@gmail.com", dtNascNatan, alNatan, unimed);

        //Segunda paciente:
        Date dtLaura = new Date(2004, 01, 17);
        ArrayList<String> alLaura = new ArrayList<>();
        alLaura.add("Respiratória");
        Paciente laura = new Paciente("123.123.111-11", "Laura Maria", "3198292921", "Rua Magnolia 33 centro", "laura@gmail.com", dtLaura, alLaura, saudeBradesco);

        Date dtPedro = new Date(1990, 02, 10);
        ArrayList<String> alPedr = new ArrayList<>();
        alPedr.add("Carne vermelha");
        Paciente pedro = new Paciente("123.123.111-22", "Pedro Carvalho", "3187346520", "Rua fernandes 21 barreiro", "pedro@gmail.com", dtPedro, alPedr, unimed);

        Date dtFernanda = new Date(1981, 05, 01);
        ArrayList<String> alFernanda = new ArrayList<>();
        alFernanda.add("Peixe");
        Paciente fernanda = new Paciente("123.123.111-33", "Fernada Lopes", "318732323", "Rua tupis 12", "fernanda@gmail.com", dtFernanda, alFernanda, unimed);

        Date dtSabrina = new Date(2000, 06, 02);
        ArrayList<String> alSabrina = new ArrayList<>();
        alSabrina.add("Jóias");
        Paciente sabrina = new Paciente("123.123.111-444", "Sabrina Silva", "319833321", "Rua taran 04", "sabrina@gmail.com", dtSabrina, alSabrina, saudeBradesco);

    }


}

//Dates e Arrays devem serem instanciadas antes.