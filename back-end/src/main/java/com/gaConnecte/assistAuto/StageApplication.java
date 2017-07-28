package com.gaConnecte.assistAuto;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gaConnecte.assistAuto.daos.ClientRepository;

import com.gaConnecte.assistAuto.daos.PackRepository;
import com.gaConnecte.assistAuto.entities.Client;

import com.gaConnecte.assistAuto.entities.Pack;
import com.gaConnecte.assistAuto.entities.Ville;

@SpringBootApplication
public class StageApplication  implements CommandLineRunner{
	
	

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private PackRepository packRepository;
	
	public static void main(String[] args)  {
		SpringApplication.run(StageApplication.class, args);
	}
	
	
	
	
	
	
	
	@Override
	public void run(String... arg0) throws Exception {
		
		
		
		
		
		
		/*Gouvernorat g1 = new Gouvernorat("Ariana");
		Gouvernorat g2 = new Gouvernorat("Béja");
		Gouvernorat g3 = new Gouvernorat("Ben Arous");
		Gouvernorat g4 = new Gouvernorat("Bizerte");
		Gouvernorat g5 = new Gouvernorat("Gabès");
		Gouvernorat g6 = new Gouvernorat("Gafsa");
		Gouvernorat g7 = new Gouvernorat("Jendouba");
		Gouvernorat g8 = new Gouvernorat("Kairouan");
		Gouvernorat g9 = new Gouvernorat("Kasserine");
		Gouvernorat g10 = new Gouvernorat("Kébili");
		Gouvernorat g11 = new Gouvernorat("Le Kef");
		Gouvernorat g12 = new Gouvernorat("Mahdia");
		Gouvernorat g13 = new Gouvernorat("La Manouba");
		Gouvernorat g14 = new Gouvernorat("Médenine");
		Gouvernorat g15 = new Gouvernorat("Monastir");
		Gouvernorat g16 = new Gouvernorat("Nabeul");
		Gouvernorat g17 = new Gouvernorat("Sfax");
		Gouvernorat g18 = new Gouvernorat("Sidi Bouzid");
		Gouvernorat g19 = new Gouvernorat("Siliana");
		Gouvernorat g20 = new Gouvernorat("Sousse");
		Gouvernorat g21 = new Gouvernorat("Tataouine");
		Gouvernorat g22 = new Gouvernorat("Tozeur");
		Gouvernorat g23 = new Gouvernorat("Tunis");
		Gouvernorat g24 = new Gouvernorat("Zaghouan");
		
		
		
		
		Ville v1 = new Ville("Al bustan",g1);
		Ville v2 = new Ville("Al madinah",g1);
		Ville v3 = new Ville("Al umran",g1);
		Ville v4 = new Ville("Ariana - 2080",g1);
		Ville v5 = new Ville("Armand colin",g1);
		Ville v6 = new Ville("At tawfiq",g1);
		Ville v7 = new Ville("Attar",g1);
		Ville v8 = new Ville("Awsajah",g1);
		Ville v9 = new Ville("Bab al jazirah",g1);
		Ville v10 = new Ville("Bab as suwayqah",g1);
		Ville v11 = new Ville("Bab khadra",g1);
		Ville v12 = new Ville("Bab saadoun - 1029",g1);
		Ville v13 = new Ville("Beau site",g1);
		Ville v14 = new Ville("Belvedere - 7000",g1);
		Ville v15 = new Ville("Birine - 1095",g1);
		Ville v16 = new Ville("Borj aalouine",g1);
		Ville v17 = new Ville("Borj bou khail",g1);
		Ville v18 = new Ville("Borj chakir - 1095",g1);
		Ville v19 = new Ville("Borj el amri - 1142",g1);
		Ville v20 = new Ville("Borj el hafsia",g1);
		Ville v21 = new Ville("Borj el khessous",g1);
		Ville v22 = new Ville("Borj et touil",g1);
		Ville v23 = new Ville("Borj frennj",g1);
		Ville v24 = new Ville("Borj turki - 2058",g1);
		Ville v25 = new Ville("Bou regba - 1110",g1);
		Ville v26 = new Ville("Brada - 5115",g1);
		
		Ville v27 = new Ville("Burj bu ar ramadah",g1);
		Ville v28 = new Ville("Cremieuxville",g1);
		Ville v29 = new Ville("Damous el laya",g1);
		Ville v30 = new Ville("Dar bu diya",g1);
		Ville v31 = new Ville("Dar el haj ahmed",g1);
		Ville v32 = new Ville("Dar el haj youssef",g1);
		Ville v33 = new Ville("Dar muhammad bin masud",g1);
		Ville v34 = new Ville("Dar naheli",g1);
		Ville v35 = new Ville("Dawwar az zaribah",g1);
		Ville v36 = new Ville("Dawwar az zughb",g1);
		Ville v37 = new Ville("Douar charbi",g1);
		Ville v38 = new Ville("Douar el guessa",g1);
		Ville v39 = new Ville("Douar el haim",g1);
		Ville v40= new Ville("Douar gabrejelli",g1);
		
		Ville v41 = new Ville("Douar sidi bou hanech",g1);
		Ville v42 = new Ville("El aroussia - 1130",g1);
		Ville v43 = new Ville("El battan - 1114",g1);
		Ville v44 = new Ville("El fahs - 1140",g1);
		List<Ville> listAriana= new ArrayList<Ville>() ;
		listAriana.add(v1);
		listAriana.add(v2);
		listAriana.add(v3);
		listAriana.add(v4);
		listAriana.add(v5);
		listAriana.add(v6);
		listAriana.add(v7);
		listAriana.add(v8);
		listAriana.add(v9);
		listAriana.add(v10);
		listAriana.add(v11);
		listAriana.add(v12);
		listAriana.add(v13);
		listAriana.add(v14);
		listAriana.add(v15);
		listAriana.add(v16);
		listAriana.add(v17);
		listAriana.add(v18);
		listAriana.add(v19);
		listAriana.add(v20);
		listAriana.add(v21);
		listAriana.add(v22);
		listAriana.add(v23);
		listAriana.add(v24);
		listAriana.add(v25);
		listAriana.add(v26);
		listAriana.add(v27);
		listAriana.add(v28);
		listAriana.add(v29);
		listAriana.add(v30);
		listAriana.add(v31);
		listAriana.add(v32);
		listAriana.add(v33);
		listAriana.add(v34);
		listAriana.add(v35);
		listAriana.add(v36);
		listAriana.add(v37);
		listAriana.add(v38);
		listAriana.add(v39);
		listAriana.add(v40);
		listAriana.add(v41);
		listAriana.add(v42);
		listAriana.add(v43);
		listAriana.add(v44);
		
		g1.setVilles(listAriana);
		gouvernoratRepository.save(g1);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		Ville v45 = new Ville("Beja - 9000",g2);
		Ville v46 = new Ville("Dar chaouch ali ben khalifa",g2);
		Ville v47 = new Ville("Dar cheikh ali",g2);
		Ville v48 = new Ville("El mejless",g2);
		List<Ville> listBeja= new ArrayList<Ville>() ;
		listBeja.add(v45);
		listBeja.add(v46);
		listBeja.add(v47);
		listBeja.add(v48);
		g2.setVilles(listBeja);
		gouvernoratRepository.save(g2);
		/////////////////////////////////////////////////////////////////////////////////
		
		Ville v49 = new Ville("Borj ahmed zaid",g3);
		Ville v50 = new Ville("Douar abd el kader",g3);
		Ville v51 = new Ville("Douar ali ben ahmar",g3);
		Ville v52 = new Ville("Douar ben miled",g3);
		Ville v53 = new Ville("Douar ben said",g3);
		Ville v54 = new Ville("Douar bou said",g3);
		Ville v55 = new Ville("Douar ech cherit",g3);
		Ville v56 = new Ville("Douar el ghezel",g3);
		Ville v57 = new Ville("Douar el haj jemaa",g3);
		Ville v58 = new Ville("Douar el haj mosbah",g3);
		Ville v59 = new Ville("Douar ennbaza",g3);
		Ville v60 = new Ville("Douar er rahmane",g3);
		
		List<Ville> listBenArous= new ArrayList<Ville>() ;
		listBenArous.add(v49);
		listBenArous.add(v50);
		listBenArous.add(v51);
		listBenArous.add(v52);
		listBenArous.add(v53);
		listBenArous.add(v54);
		listBenArous.add(v55);
		listBenArous.add(v56);
		listBenArous.add(v57);
		listBenArous.add(v58);
		listBenArous.add(v59);
		listBenArous.add(v60);
		g3.setVilles(listBenArous);
		gouvernoratRepository.save(g3);
		///////////////////////////////////////////////////////////////////////////////
		
		
		Ville v61 = new Ville("Ain el faroua",g4);
		Ville v62 = new Ville("Bechater",g4);
		Ville v63 = new Ville("Bizerte - 7000",g4);
		Ville v64 = new Ville("Borj ali ben sil",g4);
		Ville v65 = new Ville("Borj amera trabesse",g4);
		Ville v66 = new Ville("Borj ben aouali",g4);
		Ville v67 = new Ville("Borj ben chelbi",g4);
		Ville v68 = new Ville("Borj ech chouchana",g4);
		Ville v69 = new Ville("Borj el habib",g4);
		Ville v70 = new Ville("Borj el haj salah",g4);
		Ville v71 = new Ville("Borj el hatat",g4);
		Ville v72 = new Ville("Borj el kherba",g4);
		Ville v73 = new Ville("Borj hadida",g4);
		Ville v74 = new Ville("Borj mahjouba",g4);
		Ville v75 = new Ville("Borj ouichka",g4);
		Ville v76 = new Ville("Camp du zarour",g4);
		Ville v77 = new Ville("Chaouat - 1134",g4);
		Ville v78 = new Ville("Cheikh birm",g4);
		Ville v79 = new Ville("Daour amar ben ali saidani",g4);
		Ville v80 = new Ville("Daour haoussene",g4);
		Ville v81 = new Ville("Dar abdallah bel haj",g4);
		Ville v82 = new Ville("Dar ali ben hamidou",g4);
		Ville v83 = new Ville("Dar bou zeraia",g4);
		Ville v84 = new Ville("Dar ech cheikh amor ben ali",g4);
		Ville v85 = new Ville("Dar el beida",g4);
		Ville v86 = new Ville("Dar el cheikh kilani",g4);
		
		Ville v87 = new Ville("Dar hassene ech chemiki",g4);
		Ville v88 = new Ville("Dar mohammed bel haj",g4);
		Ville v89 = new Ville("Dar sidi el moujad",g4);
		Ville v90 = new Ville("De carnieres",g4);
		Ville v91 = new Ville("Dechour marraoua",g4);
		Ville v92 = new Ville("Douar abdallah",g4);
		Ville v93 = new Ville("Douar ain ghelal",g4);
		Ville v94 = new Ville("Douar ali ben amara",g4);
		Ville v95 = new Ville("Douar amor cherina",g4);
		Ville v96 = new Ville("Douar baya rassa",g4);
		Ville v97 = new Ville("Douar bechouk",g4);
		Ville v98 = new Ville("Douar bel aid",g4);
		Ville v99 = new Ville("Douar belghout",g4);
		Ville v100= new Ville("Douar ben amara",g4);
		
		Ville v101 = new Ville("Douar ben aouda",g4);
		Ville v102= new Ville("Douar ben chelbi",g4);
		Ville v103 = new Ville("Douar ben hamda ech chrif",g4);
		Ville v104 = new Ville("Douar ben hamouda el klia",g4);
		
		
		
		
		
		Ville v105 = new Ville("Douar ben mannsour",g4);
		Ville v106= new Ville("Douar ben mosbah",g4);
		Ville v107 = new Ville("Douar ben nasseur",g4);
		Ville v108 = new Ville("Douar ben nour",g4);
		Ville v109 = new Ville("Douar ben sadek",g4);
		Ville v110 = new Ville("Douar ben tiba",g4);
		Ville v111= new Ville("Douar beni oudzil",g4);
		Ville v112 = new Ville("Douar beni oussel",g4);
		Ville v113 = new Ville("Douar berna",g4);
		Ville v114 = new Ville("Douar besbessia",g4);
		Ville v115 = new Ville("Douar bessouf",g4);
		Ville v116 = new Ville("Douar bir abd el ghim",g4);
		Ville v117 = new Ville("Douar bir es soula",g4);
		Ville v118 = new Ville("Douar bou chenina",g4);
		Ville v119 = new Ville("Douar bou jourane",g4);
		Ville v120 = new Ville("Douar bou rkane",g4);
		Ville v121 = new Ville("Douar brahim ben rahal",g4);
		Ville v122 = new Ville("Douar cheikh ali",g4);
		Ville v123 = new Ville("Douar dagma",g4);
		Ville v124 = new Ville("Douar dahmani",g4);
		Ville v125 = new Ville("Douar dar ammar",g4);
		Ville v126 = new Ville("Douar dar ramel",g4);
		Ville v127 = new Ville("Douar douahria",g4);
		Ville v128 = new Ville("Douar douimis",g4);
		Ville v129 = new Ville("Douar ech chaouia",g4);
		Ville v130 = new Ville("Douar ech chatib",g4);
		
		Ville v131 = new Ville("Douar ech cheniti",g4);
		Ville v132 = new Ville("Douar ech cherif",g4);
		Ville v133 = new Ville("Douar ed demane ez zaa",g4);
		Ville v134 = new Ville("Douar ed douimis",g4);
		Ville v135 = new Ville("Douar ed douira",g4);
		Ville v136 = new Ville("Douar ej jenane",g4);
		Ville v137 = new Ville("Douar el agha",g4);
		Ville v138 = new Ville("Douar el aich ben hamza",g4);
		Ville v139 = new Ville("Douar el aouachia",g4);
		Ville v140 = new Ville("Douar el arab",g4);
		Ville v141 = new Ville("Douar el arianout",g4);
		Ville v142 = new Ville("Douar el assafir",g4);
		Ville v143 = new Ville("Douar el bachir",g4);
		Ville v144= new Ville("Douar el bakhia",g4);
		
		Ville v145 = new Ville("Douar el beida",g4);
		Ville v146 = new Ville("Douar el bezazia",g4);
		Ville v147 = new Ville("Douar el blate",g4);
		Ville v148 = new Ville("Douar el faroua",g4);
		

		Ville v149 = new Ville("Douar el feja",g4);
		Ville v150 = new Ville("Douar el felta",g4);
		Ville v151 = new Ville("Douar el ghirane",g4);
		Ville v152 = new Ville("Douar el graya",g4);
		Ville v153 = new Ville("Douar el guezadri",g4);
		Ville v154 = new Ville("Douar el haj bou amra",g4);
		Ville v155 = new Ville("Douar el haj mohammed",g4);
		Ville v156 = new Ville("Douar el haj mohammed ben hassene",g4);
		Ville v157 = new Ville("Douar el haj said",g4);
		Ville v158 = new Ville("Douar el hajerine",g4);
		Ville v159 = new Ville("Douar el haouidh",g4);
		Ville v160 = new Ville("Douar el hassini",g4);
		Ville v161 = new Ville("Douar el helalif",g4);
		Ville v162= new Ville("Douar el hofer",g4);
		
		Ville v163 = new Ville("Douar el kechabta",g4);
		Ville v164 = new Ville("Douar el kharrouba",g4);
		Ville v165 = new Ville("Douar el kherifa",g4);
		List<Ville> listBizete= new ArrayList<Ville>() ;
		
		listBizete.add(v61);
		listBizete.add(v62);
		listBizete.add(v63);
		listBizete.add(v64);
		listBizete.add(v65);
		listBizete.add(v66);
		listBizete.add(v67);
		listBizete.add(v68);
		listBizete.add(v69);
		listBizete.add(v70);
		listBizete.add(v71);
		listBizete.add(v72);
		listBizete.add(v73);
		listBizete.add(v74);
		listBizete.add(v75);
		listBizete.add(v76);
		listBizete.add(v77);
		listBizete.add(v78);
		listBizete.add(v79);
		listBizete.add(v80);
		listBizete.add(v81);
		listBizete.add(v82);
		listBizete.add(v83);
		listBizete.add(v84);
		listBizete.add(v85);
		listBizete.add(v86);
		listBizete.add(v87);
		listBizete.add(v88);
		listBizete.add(v89);
		listBizete.add(v90);
		listBizete.add(v91);
		listBizete.add(v92);
		listBizete.add(v93);
		listBizete.add(v94);
		listBizete.add(v95);
		listBizete.add(v96);
		listBizete.add(v97);
		listBizete.add(v98);
		listBizete.add(v99);
		listBizete.add(v100);
		listBizete.add(v101);
		listBizete.add(v102);
		listBizete.add(v103);
		listBizete.add(v104);
		listBizete.add(v105);
		listBizete.add(v106);
		listBizete.add(v107);
		listBizete.add(v108);
		listBizete.add(v109);
		listBizete.add(v110);
		listBizete.add(v111);
		listBizete.add(v112);
		listBizete.add(v113);
		listBizete.add(v114);
		listBizete.add(v115);
		listBizete.add(v116);
		listBizete.add(v117);
		listBizete.add(v118);
		listBizete.add(v119);
		listBizete.add(v120);
		listBizete.add(v121);
		listBizete.add(v122);
		listBizete.add(v123);
		listBizete.add(v124);
		listBizete.add(v125);
		listBizete.add(v126);
		listBizete.add(v127);
		listBizete.add(v128);
		listBizete.add(v129);
		listBizete.add(v130);
		listBizete.add(v131);
		listBizete.add(v132);
		listBizete.add(v133);
		listBizete.add(v134);
		listBizete.add(v135);
		listBizete.add(v136);
		listBizete.add(v137);
		listBizete.add(v138);
		listBizete.add(v139);
		listBizete.add(v140);
		listBizete.add(v141);
		listBizete.add(v142);
		listBizete.add(v143);
		listBizete.add(v144);
		listBizete.add(v145);
		listBizete.add(v146);
		listBizete.add(v147);
		listBizete.add(v148);
		listBizete.add(v149);
		listBizete.add(v150);
		listBizete.add(v151);
		listBizete.add(v152);
		listBizete.add(v153);
		listBizete.add(v154);
		listBizete.add(v155);
		listBizete.add(v156);
		listBizete.add(v157);
		listBizete.add(v158);
		listBizete.add(v159);
		listBizete.add(v160);
		listBizete.add(v161);
		listBizete.add(v162);
		listBizete.add(v163);
		listBizete.add(v164);
		listBizete.add(v165);
		g4.setVilles(listBizete);
		gouvernoratRepository.save(g4);

////////////////////////////////////////////////////////////////////////////////////////////////
		
		Ville v166 = new Ville("Ad dabdabah",g5);
		Ville v167 = new Ville("Al barawikah",g5);
		Ville v168 = new Ville("Al hafsah",g5);
		Ville v169 = new Ville("Al khirbah",g5);
		Ville v170 = new Ville("Al maiyah",g5);
		Ville v171 = new Ville("Al manarah",g5);
		Ville v172 = new Ville("Al matwiyah",g5);
		Ville v173 = new Ville("Al mayyitah",g5);
		Ville v174 = new Ville("Al medou",g5);
		Ville v175 = new Ville("Al qasr",g5);
		Ville v176 = new Ville("Al urqub",g5);
		Ville v177 = new Ville("An nahl",g5);
		
		Ville v178 = new Ville("Arram - 6016",g5);
		Ville v179 = new Ville("Az zarat",g5);
		Ville v180 = new Ville("Az zaribah",g5);
		Ville v181 = new Ville("Bani isa",g5);
		Ville v182= new Ville("Bani seggane",g5);
		Ville v183 = new Ville("Bani zaltan",g5);
		Ville v184 = new Ville("Barquq",g5);
		Ville v185 = new Ville("Bin rhilouf",g5);
		Ville v186 = new Ville("Bu attush",g5);
		Ville v187 = new Ville("Bu sabah",g5);
		Ville v188 = new Ville("Bu shammah",g5);
		Ville v189 = new Ville("El hamma - 6020",g5);
		
		Ville v190 = new Ville("Gabes - 6000",g5);
		Ville v191 = new Ville("Ghannush",g5);
		List<Ville> listeGabes = new  ArrayList<Ville>() ;
		listeGabes.add(v166);
		listeGabes.add(v167);
		listeGabes.add(v168);
		listeGabes.add(v169);
		listeGabes.add(v170);
		listeGabes.add(v171);
		listeGabes.add(v172);
		listeGabes.add(v173);
		listeGabes.add(v174);
		listeGabes.add(v175);
		listeGabes.add(v176);
		listeGabes.add(v177);
		listeGabes.add(v178);
		listeGabes.add(v179);
		listeGabes.add(v180);
		listeGabes.add(v181);
		listeGabes.add(v182);
		listeGabes.add(v183);
		listeGabes.add(v184);
		listeGabes.add(v185);
		listeGabes.add(v186);
		listeGabes.add(v187);
		listeGabes.add(v189);
		listeGabes.add(v190);
		listeGabes.add(v191);
		g5.setVilles(listeGabes);
		gouvernoratRepository.save(g5);*/
		
		
		
		
		
		
		
	}
	
	
}
