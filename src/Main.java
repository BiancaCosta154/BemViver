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

        System.out.println("---------------------------------Anotações médicas:-----------------------------------------------------");
        AnotacaoMedica ant = new AnotacaoMedica(1,"2025-5-2","Estável, sem queixas. Exames laboratoriais normais. Orientado quanto ao uso de medicação e retorno em 7 dias. Alta autorizada",jose);
        AnotacaoMedica ant1 = new AnotacaoMedica(2,"2025-3-12","Queixa de dor lombar 6/10. Sem irradiação. Marcha preservada. Iniciado analgésico. Agendada imagem.",carlos);
        AnotacaoMedica ant2 = new AnotacaoMedica(3,"2024-11-2","Evolui afebril, melhora clínica. Aceitando dieta, sem náuseas. Antibiótico mantido conforme esquema.",jose);
        AnotacaoMedica ant3 = new AnotacaoMedica(4,"2025-12-3","Paciente lúcido, orientado, sem queixas. Sinais vitais estáveis. Curativo limpo e seco. Mantido em observação.",marina);
        AnotacaoMedica ant4 = new AnotacaoMedica(5,"2023-02-1","Paciente orientado, afebril, sinais vitais normais. Queixa de dor leve em abdômen. Sem alterações relevantes no exame físico.",carla);

        System.out.println("---------------------------------Despesas:-----------------------------------------------------");
        Date dtdep1 = new Date(2025, 01, 11);
        Date dtdep2 = new Date(2022, 03, 7);
        Date dtdep3 = new Date(2024, 10, 2);
        Date dtdep4 = new Date(2025, 01, 1);
        Date dtdep5 = new Date(2023, 12, 17);

        Despesas dep = new Despesas(1,"Materiais de cirurgia",dtdep1);
        Despesas dep2 = new Despesas(1,"Materiais de cirurgia",dtdep2);
        Despesas dep3= new Despesas(1,"Materiais de cirurgia",dtdep3);
        Despesas dep4= new Despesas(1,"Materiais de cirurgia",dtdep4);
        Despesas dep5= new Despesas(1,"Materiais de cirurgia",dtdep5);

        System.out.println("---------------------------------Exames:-----------------------------------------------------");
        Date dte1 = new Date(2023, 12, 22);
        Date dte2 = new Date(2022, 3, 13);
        Date dte3 = new Date(2023, 5, 10);
        Date dte4 = new Date(2025, 2, 7);
        Date dte5 = new Date(2025, 01, 1);

        Exame e1 = new Exame(1,"23","Hemograma","Fleury",dte1,"13,8g/dl");
        Exame e2 = new Exame(2,"212","Eletrocardiograma","Sabin",dte2,"ECG normal");
        Exame e3 = new Exame(3,"33","Raio-x","Fleury",dte3,"Pneumonia");
        Exame e4 = new Exame(4,"132","Ultrassonografia","Dasa",dte4,"Normal");
        Exame e5 = new Exame(5,"324","Exame de urina","São Marcos",dte5,"Infecção");

        System.out.println("---------------------------------Itens Estoque:-----------------------------------------------------");
        Date dti = new Date(2025, 2, 2);
        Date dti2 = new Date(2025, 10, 26);
        Date dti3 = new Date(2025, 2, 21);
        Date dti4= new Date(2025, 1, 6);
        Date dti5= new Date(2025, 3, 22);

        ItemEstoque i1 = new ItemEstoque(1,"Agulha,",20,dti,"insulina");
        ItemEstoque i2 = new ItemEstoque(2,"Agulha,",20,dti2,"biópsia");
        ItemEstoque i3 = new ItemEstoque(3,"Soro fisiológico,",30,dti3,"líquido");
        ItemEstoque i4 = new ItemEstoque(4,"Monitor cardíaco,",10,dti4,"Pressão arterial");
        ItemEstoque i5 = new ItemEstoque(5,"Agulha,",20,dti5,"venosa");

        System.out.println("---------------------------------Logins de Acesso:-----------------------------------------------------");
        Date dtlog = new Date(2025, 4, 21);
        Date dtlog2 = new Date(2024, 3, 2);
        Date dtlog3 = new Date(2025, 12, 6);
        Date dtlog4 = new Date(2025, 1, 2);
        Date dtlog5 = new Date(2025, 2, 2);

        LogAcesso lg1 = new LogAcesso("Fer123","Visualizado",dtlog);
        LogAcesso lg2 = new LogAcesso("Hiago3","Não Visualizado",dtlog2);
        LogAcesso lg3 = new LogAcesso("Jose12","Alterou consulta",dtlog3);
        LogAcesso lg4 = new LogAcesso("Fer123","Visualizado",dtlog4);
        LogAcesso lg5 = new LogAcesso("Fer123","Alterou consulta",dtlog5);

        System.out.println("---------------------------------TipoConsulta:-----------------------------------------------------");
        TipoConsulta t1 = new TipoConsulta("Check-up","agendar");
        TipoConsulta t2 = new TipoConsulta("Consulta de emergência","ligar");
        TipoConsulta t3 = new TipoConsulta("Acompanhamento","consultar");
        TipoConsulta t4 = new TipoConsulta("Consulta saúde mental","agendar");
        TipoConsulta t5 = new TipoConsulta("Consulta especializada","agendar");

        System.out.println("---------------------------------Vídeos chamadas:-----------------------------------------------------");
        VideoChamada v1 = new VideoChamada("v1",true );
        VideoChamada v2 = new VideoChamada("v2",true );
        VideoChamada v3 = new VideoChamada("v3",true );
        VideoChamada v4 = new VideoChamada("v4",true );
        VideoChamada v5 = new VideoChamada("v5",true );

        System.out.println("---------------------------------Usuários:-----------------------------------------------------");
        Date dtu1 = new Date(2001, 8, 21);
        Date dtu2 = new Date(2002, 10, 1);
        Date dtu3 = new Date(1899, 1, 11);
        Date dtu4 = new Date(1890, 5, 3);
        Date dtu5 = new Date(1990, 4, 1);

        Usuarios u1 = new Usuarios("1234342342","Jose","31 94328341", "Berania 123","jose@hotmail.com", dtu1);
        Usuarios u2 = new Usuarios("234343452","Maria","32 91265835", "Centro, Gois 5","maria@hotmail.com",dtu2);
        Usuarios u3 = new Usuarios("312414432","Antônio","12 95345836", "Barreiro, Josué 2","antonio@hotmail.com",dtu3);
        Usuarios u4 = new Usuarios("532525325","Calos","31 904334838", "São João 20","carlos@hotmail.com",dtu4);
        Usuarios u5 = new Usuarios("534646436","Maia","13 93534837", "São marcos 203","maia@hotmail.com",dtu5);

        System.out.println("---------------------------------Receitas:-----------------------------------------------------");

        Date dtr1 = new Date(2025, 02, 1);
        ArrayList<Medicamentos> rar = new ArrayList<>();
        Receita r1 = new Receita(1,dtr1,rar,jose);

        Date dtr2 = new Date(2025, 02, 2);
        ArrayList<Medicamentos> rar2 = new ArrayList<>();
        Receita r2 = new Receita(1,dtr1,rar,maria);

        Date dtr3 = new Date(2025, 02, 3);
        ArrayList<Medicamentos> ra3 = new ArrayList<>();
        Receita r3 = new Receita(1,dtr1,rar,carla);

        Date dtr4 = new Date(2025, 02, 4);
        ArrayList<Medicamentos> rar4 = new ArrayList<>();
        Receita r4 = new Receita(1,dtr1,rar,jose);

        Date dtr5 = new Date(2025, 02, 5);
        ArrayList<Medicamentos> rar5 = new ArrayList<>();
        Receita r5 = new Receita(1,dtr1,rar,marina);

        System.out.println("---------------------------------Prontuário Eletrônico:-----------------------------------------------------");
        ArrayList<AnotacaoMedica> am = new ArrayList<>();
        ArrayList<Receita> pe = new ArrayList<>();
        ProntuarioEletronicos pe1 = new ProntuarioEletronicos(am,pe);

        ArrayList<AnotacaoMedica> am2 = new ArrayList<>();
        ArrayList<Receita> pe2 = new ArrayList<>();
        ProntuarioEletronicos pee2 = new ProntuarioEletronicos(am2,pe2);

        ArrayList<AnotacaoMedica> am3 = new ArrayList<>();
        ArrayList<Receita> pe3 = new ArrayList<>();
        ProntuarioEletronicos pee3 = new ProntuarioEletronicos(am3,pe3);

        ArrayList<AnotacaoMedica> am4 = new ArrayList<>();
        ArrayList<Receita> pe4 = new ArrayList<>();
        ProntuarioEletronicos pee4 = new ProntuarioEletronicos(am4,pe4);

        ArrayList<AnotacaoMedica> am5 = new ArrayList<>();
        ArrayList<Receita> pe5 = new ArrayList<>();
        ProntuarioEletronicos pee5 = new ProntuarioEletronicos(am5,pe5);

        System.out.println("---------------------------------Financeiro:-----------------------------------------------------");
        ArrayList<Fatura> f = new ArrayList<>();
        ArrayList<Despesas> d = new ArrayList<>();
        Financeiro fin = new Financeiro(f,d);

        ArrayList<Fatura> f2 = new ArrayList<>();
        ArrayList<Despesas> d2 = new ArrayList<>();
        Financeiro fin2 = new Financeiro(f2,d2);

        ArrayList<Fatura> f3 = new ArrayList<>();
        ArrayList<Despesas> d3 = new ArrayList<>();
        Financeiro fin3 = new Financeiro(f3,d3);

        ArrayList<Fatura> f4= new ArrayList<>();
        ArrayList<Despesas> d4 = new ArrayList<>();
        Financeiro fin4 = new Financeiro(f4,d4);

        ArrayList<Fatura> f5 = new ArrayList<>();
        ArrayList<Despesas> d5 = new ArrayList<>();
        Financeiro fin5 = new Financeiro(f5,d5);


        System.out.println("---------------------------------Consultas:-----------------------------------------------------");

        Consulta cons1 = new Consulta(1,t1,laura,jose,dtLaura,"não se aplica","dor de cabeça");
        Consulta cons2 = new Consulta(2,t1,pedro,marina,dtLaura,"não se aplica","alergia");
        Consulta cons3 = new Consulta(3,t1,fernanda,carlos,dtLaura,"não se aplica","dores abdominais");
        Consulta cons4 = new Consulta(4,t1,natan,maria,dtLaura,"não se aplica","cólica tensa");
        Consulta cons5 = new Consulta(5,t1,sabrina,carla,dtLaura,"não se aplica","dor de barriga");


        System.out.println("---------------------------------Estoque:-----------------------------------------------------");
        ArrayList<ItemEstoque> medic1 = new ArrayList<>();
        ArrayList<ItemEstoque> mater1 = new ArrayList<>();
        Estoque est1 = new Estoque(medic1,mater1);

        ArrayList<ItemEstoque> medic2 = new ArrayList<>();
        ArrayList<ItemEstoque> mater2 = new ArrayList<>();
        Estoque est2 = new Estoque(medic2,mater2);

        ArrayList<ItemEstoque> medic3 = new ArrayList<>();
        ArrayList<ItemEstoque> mater3 = new ArrayList<>();
        Estoque est3 = new Estoque(medic3,mater3);

        ArrayList<ItemEstoque> medic4 = new ArrayList<>();
        ArrayList<ItemEstoque> mater4 = new ArrayList<>();
        Estoque est4 = new Estoque(medic4,mater4);

        ArrayList<ItemEstoque> medic5 = new ArrayList<>();
        ArrayList<ItemEstoque> mater5 = new ArrayList<>();
        Estoque est5 = new Estoque(medic5,mater5);

        System.out.println("---------------------------------Faturas:-----------------------------------------------------");

        Fatura fat1 = new Fatura(cons1,200,"débito",false);
        Fatura fat2 = new Fatura(cons1,1110,"crédito",false);
        Fatura fat3 = new Fatura(cons1,100,"à vista",true);
        Fatura fat4 = new Fatura(cons1,200,"débito",true);
        Fatura fat5 = new Fatura(cons1,800,"crédito",false);


        System.out.println("---------------------------------Alergias:-----------------------------------------------------");
        Alergia alerg = new Alergia(1,"Camarão","mediana",natan);
        Alergia alerg2 = new Alergia(2,"Cachorro","baixa",laura);
        Alergia alerg3 = new Alergia(3,"Carne vermelha","alta",pedro);
        Alergia alerg4 = new Alergia(4,"Tecido","baixa",fernanda);
        Alergia alerg5 = new Alergia(5,"Nozes","mediana",sabrina);
    }


}

//Dates e Arrays devem serem instanciadas antes.
