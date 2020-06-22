package com.example.cpgg;

import java.util.ArrayList;
import java.util.List;


public class list {
    public List<String> District() {

        List<String> district = new ArrayList<String>();
        district.add("Select(District)");
        district.add("Almora");
        district.add("Bageshwar");
        district.add("Chamoli");
        district.add("Champawat");
        district.add("Dehradun");
        district.add("Haridwar");
        district.add("Nainital");
        district.add("Pauri");
        district.add("Pithoragarh");
        district.add("Rudraprayag");
        district.add("Tehri");
        district.add("U S Nagar");
        district.add("Uttarakashi");

        return district;
    }
   public List<String> Block(int i) {

        List<String> block= new ArrayList<String>();
        block.add("Block");

        List<String> Uttarakashi = new ArrayList<String>();
        Uttarakashi.add("Block");
        Uttarakashi.add("Puraula");
        Uttarakashi.add("Mori");
        Uttarakashi.add("Naugaon");
        Uttarakashi.add("Dunda");
        Uttarakashi.add("Chiniyalisaur");
        Uttarakashi.add("Bhatwari");

        List<String> Chamoli = new ArrayList<String>();
        Chamoli.add("Block");
        Chamoli.add("Dasholi");
        Chamoli.add("Dewal");
        Chamoli.add("Gairsain");
        Chamoli.add("Ghat");
        Chamoli.add("Joshimath");
        Chamoli.add("Karnaprayag");
        Chamoli.add("Narayan Bagar");
        Chamoli.add("Pokhari");
        Chamoli.add("Tharali");

        List<String> Rudraprayag = new ArrayList<String>();
        Rudraprayag.add("Block");
        Rudraprayag.add("Augustmuni");
        Rudraprayag.add("Jakholi");
        Rudraprayag.add("Ukhimath");

        List<String> Tehri = new ArrayList<String>();
        Tehri.add("Block");
        Tehri.add("Bhilangana");
        Tehri.add("Kirtinagar");
        Tehri.add("Pratapnagar");
        Tehri.add("Jakhnidhar");
        Tehri.add("Devprayag");
        Tehri.add("Thauldhar");
        Tehri.add("Jaunpur");
        Tehri.add("Chamba");
        Tehri.add("Narendranagar");

        List<String> Dehradun = new ArrayList<String>();
          Dehradun.add("Block");
        Dehradun.add("Chakrata");
        Dehradun.add("Kalsi");
        Dehradun.add("Vikasnagar");
        Dehradun.add("Sahaspur");
        Dehradun.add("Raipur");
        Dehradun.add("Doiwala");

        List<String> Pauri = new ArrayList<String>();
        Pauri.add("Block");
        Pauri.add("Khirsu");
        Pauri.add("Kot");
        Pauri.add("Pauri");
        Pauri.add("Kaljikhal");
        Pauri.add("Pabo");
        Pauri.add("Khirsu");
        Pauri.add("Thalisain");
        Pauri.add("Bironkhal");
        Pauri.add("Nainidanda");
        Pauri.add("Dwarikhal");
        Pauri.add("Dugadda");
        Pauri.add("Jaiharikhal");
        Pauri.add("Ekeshwar");
        Pauri.add("Pokhara");
        Pauri.add("Rikhnikhal");
        Pauri.add("Yamkeshwar");

        List<String> Pithoragarh = new ArrayList<String>();
        Pithoragarh.add("Block");
        Pithoragarh.add("Munsiari");
        Pithoragarh.add("Dharchula");
        Pithoragarh.add("Didihat");
        Pithoragarh.add("Kanali Chhina");
        Pithoragarh.add("Berinag");
        Pithoragarh.add("Gangolihat");
        Pithoragarh.add("Bin");
        Pithoragarh.add("Munakot");

        List<String> Bageshwar = new ArrayList<String>();
        Bageshwar.add("Block");
        Bageshwar.add("Kapkot");
        Bageshwar.add("Bageshwar");
        Bageshwar.add("Garud");

        List<String> Almora = new ArrayList<String>();
        Almora.add("Block");
        Almora.add("Syaldey");
        Almora.add("Chaukhutiya");
        Almora.add("Bhikiyasain");Almora.add("Tarikhet");Almora.add("Sult");
        Almora.add("Dwarahat");
        Almora.add("Takula");Almora.add("Bhaisiya Chhana");
        Almora.add("Hawal Bagh");
        Almora.add("Lamgarha");
        Almora.add("Dhaula Devi");

        List<String> Champawat = new ArrayList<String>();
        Champawat.add("Block");
        Champawat.add("Champawat");
        Champawat.add("Pati");
        Champawat.add("Barakot");
        Champawat.add("Lohaghat");

        List<String> Nainital = new ArrayList<String>();
        Nainital.add("Block");
        Nainital.add("Betalghat");
        Nainital.add("Ramgarh");
        Nainital.add("Kotabagh");
        Nainital.add("Bhimtal");
        Nainital.add("Dhari");
        Nainital.add("Okhal Kanda");
        Nainital.add("Ramnagar");
        Nainital.add("Haldwani");

        List<String> USNagar = new ArrayList<String>();
        USNagar.add("Block");
        USNagar.add("Kashipur");
        USNagar.add("Jaspur");
        USNagar.add("Bajpur");
        USNagar.add("Rudrapur");
        USNagar.add("Gadarpur");
        USNagar.add("Sitarganj");
        USNagar.add("Khatima");

        List<String> Haridwar = new ArrayList<String>();
        Haridwar.add("Block");
        Haridwar.add("Bhagwanpur");
        Haridwar.add("Roorkee");
        Haridwar.add("Narsan");
        Haridwar.add("Bahadarabad");
        Haridwar.add("Laksar");
        Haridwar.add("Khanpur");

        switch(i)
        {
             case 1: return Almora;

             case 2: return Bageshwar;

             case 3: return Chamoli;

             case 4: return Champawat;

             case 5: return Dehradun;

             case 6: return Haridwar;

             case 7: return Nainital;

             case 8: return Pauri;

             case 9: return Pithoragarh;

             case 10: return Rudraprayag;

             case 11: return Tehri;

             case 12: return USNagar;

             case 13: return Uttarakashi;

             default: return block;

        }
    }

     public List<String> Nagar(int i){

          List<String> nagar = new ArrayList<String>();
          nagar.add("Nagar Palika/Nagar Panchayat");


          List<String> Uttarakashi = new ArrayList<String>();
          Uttarakashi.add("Nagar Palika/Nagar Panchayat");
          Uttarakashi.add("Nagar Palika Parishad, Uttarkashi");
          Uttarakashi.add("Nagar Palika Parishad, Chinyalisaur");
          Uttarakashi.add("Nagar Palika Parishad, Barkot");
          Uttarakashi.add("Nagar Panchayat, Purola");
          Uttarakashi.add("Nagar Panchayat, Gangotri");
          Uttarakashi.add("Nagar Panchayat, Naugaon");



          List<String> Chamoli = new ArrayList<String>();
          Chamoli.add("Nagar Palika/Nagar Panchayat");
          Chamoli.add("Nagar Palika Parishad, Chamoli-Gopeshwar");
          Chamoli.add("Nagar Palika Parishad, Joshimath");
          Chamoli.add("Nagar Palika Parishad, Gauchar");
          Chamoli.add("Nagar Panchayat, Narendranagar");
          Chamoli.add("Nagar Panchayat, Badrinath");
          Chamoli.add("Nagar Panchayat, Tharali");
          Chamoli.add("Nagar Panchayat, Pokhari");
          Chamoli.add("Nagar Panchayat, Pipalkoti");
          Chamoli.add("Nagar Panchayat, Pokhiri");
          Chamoli.add("Nagar Panchayat, Ukhimath");


          List<String> Rudraprayag = new ArrayList<String>();
          Rudraprayag.add("Nagar Palika/Nagar Panchayat");
          Rudraprayag.add("Nagar Palika Parishad, Rudraprayag");
          Rudraprayag.add("Nagar Panchayat, Kedarnath");
          Rudraprayag.add("Nagar Panchayat, Tilwada");
          Rudraprayag.add("Nagar Panchayat, Swaragashramjook");
          Rudraprayag.add("Nagar Panchayat, Satpuli");


          List<String> Tehri = new ArrayList<String>();
          Tehri.add("Nagar Palika/Nagar Panchayat");
          Tehri.add("Nagar Palika Parishad, Tehri");
          Tehri.add("Nagar Palika Parishad, Narendra Nagar");
          Tehri.add("Nagar Palika Parishad, Chamba");
          Tehri.add("Nagar Palika Parishad, Devprayag");
          Tehri.add("Nagar Palika Parishad, Muniki Reti");
          Tehri.add("Nagar Palika Parishad, Karnaprayag");
          Tehri.add("Nagar Panchayat, Kirtinagar");
          Tehri.add("Nagar Panchayat, Ghansali");
          Tehri.add("Nagar Panchayat, Gaja");
          Tehri.add("Nagar Panchayat, Lambgaon");

          List<String> Dehradun = new ArrayList<String>();
          Dehradun.add("Nagar Palika/Nagar Panchayat");
          Dehradun.add("Nagar Palika Parishad, Vikashnagar");
          Dehradun.add("Nagar Palika Parishad, Mussoorie");
          Dehradun.add("Nagar Palika Parishad, Harbatpur");
          Dehradun.add("Nagar Palika Parishad, Doiwala");
          Dehradun.add("Nagar Panchayat, SelaQui");

          List<String> Pauri = new ArrayList<String>();
          Pauri.add("Nagar Palika/Nagar Panchayat");
          Pauri.add("Nagar Palika Parishad, Pauri");
          Pauri.add("Nagar Palika Parishad, Shrinagar");
          Pauri.add("Nagar Palika Parishad, Dugadda");
          Pauri.add("Nagar Panchayat, Chamiyala");
          Pauri.add("Nagar Panchayat, Augustmuni");

          List<String> Pithoragarh = new ArrayList<String>();
          Pithoragarh.add("Nagar Palika/Nagar Panchayat");
          Pithoragarh.add("Nagar Palika Parishad, Pithoragarh");
          Pithoragarh.add("Nagar Palika Parishad, Dharchula");
          Pithoragarh.add("Nagar Palika Parishad, Didihaat");
          Pithoragarh.add("Nagar Panchayat, Gangolihat");
          Pithoragarh.add("Nagar Panchayat, Berinag");

          List<String> Bageshwar = new ArrayList<String>();
          Bageshwar.add("Nagar Palika/Nagar Panchayat");
          Bageshwar.add("Nagar Palika Parishad, Bageshwar");
          Bageshwar.add("Nagar Palika Parishad, Ranikhet Chiliyanaula");


          List<String> Almora = new ArrayList<String>();
          Almora.add("Nagar Palika/Nagar Panchayat");
          Almora.add("Nagar Palika Parishad, Almora");
          Almora.add("Nagar Panchayat, Dwarahat");
          Almora.add("Nagar Panchayat, Kapkot");
          Almora.add("Nagar Panchayat, Bhikiyasen");
          Almora.add("Nagar Panchayat, Banbasa");


          List<String> Champawat = new ArrayList<String>();
          Champawat.add("Nagar Palika/Nagar Panchayat");
          Champawat.add("Nagar Palika Parishad, Tanakpur");
          Champawat.add("Nagar Palika Parishad, Champawat");
          Champawat.add("Nagar Panchayat, Gairsain");
          Champawat.add("Nagar Panchayat, Lohaghat");

          List<String> Nainital = new ArrayList<String>();
          Nainital.add("Nagar Palika/Nagar Panchayat");
          Nainital.add("Nagar Palika Parishad, Nanital");
          Nainital.add("Nagar Palika Parishad, Ramnagar");
          Nainital.add("Nagar Palika Parishad, Bhowali");
          Nainital.add("Nagar Panchayat, Kaladhungi");
          Nainital.add("Nagar Panchayat, Lalkuan");
          Nainital.add("Nagar Panchayat, Bhimtal");


          List<String> USNagar = new ArrayList<String>();
          USNagar.add("Nagar Palika/Nagar Panchayat");
          USNagar.add("Nagar Palika Parishad, Gadarpur");
          USNagar.add("Nagar Palika Parishad, Bhojpur");
          USNagar.add("Nagar Palika Parishad, Jaspur");
          USNagar.add("Nagar Palika Parishad, Kitcha");
          USNagar.add("Nagar Palika Parishad, Sitarganj");
          USNagar.add("Nagar Palika Parishad, Khatima");
          USNagar.add("Nagar Palika Parishad, Mahuakhera Ganj");
          USNagar.add("Nagar Panchayat, Mahudabra");
          USNagar.add("Nagar Panchayat, Sultanpur Patti");
          USNagar.add("Nagar Panchayat, Kelakhera");
          USNagar.add("Nagar Panchayat, Shaktigarh");
          USNagar.add("Nagar Panchayat, Nankamta");
          USNagar.add("Nagar Panchayat, Gularbhoj");
          USNagar.add("Nagar Panchayat, Bhatrojkhan");

          List<String> Haridwar = new ArrayList<String>();
          Haridwar.add("Nagar Palika/Nagar Panchayat");
          Haridwar.add("Nagar Palika Parishad, Mangloor");
          Haridwar.add("Nagar Palika Parishad, Lakshar");
          Haridwar.add("Nagar Palika Parishad, Shivalik Nagar");
          Haridwar.add("Nagar Panchayat, Jhabrera");
          Haridwar.add("Nagar Panchayat, Landhaura");
          Haridwar.add("Nagar Panchayat, Bhagwanpur");
          Haridwar.add("Nagar Panchayat, Piran Kaliyar");

          switch(i)
          {
               case 1: return Almora;

               case 2: return Bageshwar;

               case 3: return Chamoli;

               case 4: return Champawat;

               case 5: return Dehradun;

               case 6: return Haridwar;

               case 7: return Nainital;

               case 8: return Pauri;

               case 9: return Pithoragarh;

               case 10: return Rudraprayag;

               case 11: return Tehri;

               case 12: return USNagar;

               case 13: return Uttarakashi;

               default: return nagar;

          }


     }


     List<String> State()
     {
          List<String> state = new ArrayList<String>();
          state.add("Select(State)");
          /*state.add("Andhra Pradesh");
          state.add("Arunachal Pradesh");
          state.add("Assam");
          state.add("Bihar");
          state.add("Chhattisgarh");
          state.add("Goa");
          state.add("Gujarat");
          state.add("Haryana");
          state.add("Himachal Pradesh");
          state.add("Jammu and Kashmir");
          state.add("Jharkhand");
          state.add("Karnataka");
          state.add("Kerala");
          state.add("Madhya Pradesh");
          state.add("Maharashtra");
          state.add("Manipur");
          state.add("Meghalaya");
          state.add("Mizoram");
          state.add("Nagaland");
          state.add("Odisha");
          state.add("Punjab");
          state.add("Rajasthan");
          state.add("Sikkim");
          state.add("Tamil Nadu");
          state.add("Telangana");
          state.add("Tripura");
          state.add("Uttar Pradesh");
          state.add("Uttarakhand");
          state.add("West Bengal");*/

          state.add("Uttarakhand");

          return state;
     }

     List<String> City()
     {
          List<String> city = new ArrayList<>();
          city.add("Select(City)");

          List<String> Uttarakhand = new ArrayList<>();
          Uttarakhand.add("Select(City)");
          Uttarakhand.add("Almora");
          Uttarakhand.add("Bageshwar");
          Uttarakhand.add("Bhatwari");
          Uttarakhand.add("Chakrata");
          Uttarakhand.add("Chamoli");
          Uttarakhand.add("Champawat");
          Uttarakhand.add("Dehradun");
          Uttarakhand.add("Deoprayag");
          Uttarakhand.add("Dharchula");
          Uttarakhand.add("Dunda");
          Uttarakhand.add("Haldwani");
          Uttarakhand.add("Haridwar");
          Uttarakhand.add("Joshimath");
          Uttarakhand.add("Karan Prayag");
          Uttarakhand.add("Kashipur");
          Uttarakhand.add("Khatima");
          Uttarakhand.add("Kichha");
          Uttarakhand.add("Lansdown");
          Uttarakhand.add("Munsiari");
          Uttarakhand.add("Mussoorie");
          Uttarakhand.add("Nainital");
          Uttarakhand.add("Pantnagar");
          Uttarakhand.add("Partapnagar");
          Uttarakhand.add("Pauri Garhwal");
          Uttarakhand.add("Pithoragarh");
          Uttarakhand.add("Purola");
          Uttarakhand.add("Rajgarh");
          Uttarakhand.add("Ranikhet");
          Uttarakhand.add("Roorkee");
          Uttarakhand.add("Rudraprayag");
          Uttarakhand.add("Tehri Garhwal");
          Uttarakhand.add("Udham Singh Nagar");
          Uttarakhand.add("Ukhimath");
          Uttarakhand.add("Uttarkashi");


       /*   switch(i)
          {
               case 1: return Uttarakhand;
               default: return city;
          }*/
          return Uttarakhand;
     }


     List<ArrayList<String>> sector_urban(int i) {

          ArrayList<String> S_1 = new ArrayList<String>();  // variable name as Serial No.
          S_1.add("1");
          S_1.add("101");
          S_1.add("Rice P.D.S.");
          S_1.add("Medium");
          S_1.add("per Kg");
          S_1.add("");
          S_1.add("");
          S_1.add("");


          ArrayList<String> S_2 = new ArrayList<String>();
          S_2.add("2");
          S_2.add("102");
          S_2.add("Rice Others");
          S_2.add("Medium");
          S_2.add("per Kg");
          S_2.add("");
          S_2.add("");
          S_2.add("");


          ArrayList<String> S_3 = new ArrayList<String>();  // variable name as Serial No.
          S_3.add("3");
          S_3.add("107");
          S_3.add("Wheat P.D.S.");
          S_3.add("White Dada");
          S_3.add("per Kg");
          S_3.add("");
          S_3.add("");
          S_3.add("");


          ArrayList<String> S_4 = new ArrayList<String>();
          S_4.add("4");
          S_4.add("108");
          S_4.add("Rice Others/ Wheat Flour");
          S_4.add("White Dada");
          S_4.add("per Kg");
          S_4.add("");
          S_4.add("");
          S_4.add("");

          ArrayList<String> S_5 = new ArrayList<String>();  // variable name as Serial No.
          S_5.add("5");
          S_5.add("110");
          S_5.add("Maida");
          S_5.add("Normal");
          S_5.add("per Kg");
          S_5.add("");
          S_5.add("");
          S_5.add("");


          ArrayList<String> S_6 = new ArrayList<String>();
          S_6.add("6");
          S_6.add("111");
          S_6.add("Suji");
          S_6.add("Normal");
          S_6.add("per Kg");
          S_6.add("");
          S_6.add("");
          S_6.add("");


          ArrayList<String> S_7 = new ArrayList<String>();  // variable name as Serial No.
          S_7.add("7");
          S_7.add("112");
          S_7.add("Noodles/Sevaiya");
          S_7.add("Normal");
          S_7.add("per Kg");
          S_7.add("");
          S_7.add("");
          S_7.add("");


          ArrayList<String> S_8 = new ArrayList<String>();
          S_8.add("8");
          S_8.add("291");
          S_8.add("Biscuit, Chocolate");
          S_8.add("Parle-G/Give name");
          S_8.add("per g");
          S_8.add("");
          S_8.add("");
          S_8.add("");


          ArrayList<String> S_9 = new ArrayList<String>();  // variable name as Serial No.
          S_9.add("9");
          S_9.add("486");
          S_9.add("Pisai-Aata/other");
          S_9.add("");
          S_9.add("per Kg");
          S_9.add("");
          S_9.add("");
          S_9.add("");


          List<ArrayList<String>> Serials_and_its_Production_and_Other_Services = new ArrayList<ArrayList<String>>();     //1-9
          Serials_and_its_Production_and_Other_Services.add(S_1);
          Serials_and_its_Production_and_Other_Services.add(S_2);
          Serials_and_its_Production_and_Other_Services.add(S_3);
          Serials_and_its_Production_and_Other_Services.add(S_4);
          Serials_and_its_Production_and_Other_Services.add(S_5);
          Serials_and_its_Production_and_Other_Services.add(S_6);
          Serials_and_its_Production_and_Other_Services.add(S_7);
          Serials_and_its_Production_and_Other_Services.add(S_8);
          Serials_and_its_Production_and_Other_Services.add(S_9);

          ArrayList<String> S_10 = new ArrayList<String>();  // variable name as Serial No.
          S_10.add("10");
          S_10.add("192");
          S_10.add("Goat Meat");
          S_10.add("With Bones");
          S_10.add("per Kg");
          S_10.add("");
          S_10.add("");
          S_10.add("");


          ArrayList<String> S_11 = new ArrayList<String>();
          S_11.add("11");
          S_11.add("195");
          S_11.add("Chicken");
          S_11.add("");
          S_11.add("per Kg");
          S_11.add("");
          S_11.add("");
          S_11.add("");


          List<ArrayList<String>> Meat_and_Fish= new ArrayList<ArrayList<String>>();     //1-9
          Meat_and_Fish.add(S_10);
          Meat_and_Fish.add(S_11);


          ArrayList<String> S_12 = new ArrayList<String>();
          S_12.add("12");
          S_12.add("190");
          S_12.add("Egg");
          S_12.add("Desi/Farm");
          S_12.add("per piece");
          S_12.add("");
          S_12.add("");
          S_12.add("");

          List<ArrayList<String>> Egg= new ArrayList<ArrayList<String>>();     //1-9
          Egg.add(S_12);



          ArrayList<String> S_13 = new ArrayList<String>();
          S_13.add("13");
          S_13.add("160");
          S_13.add("Milk");
          S_13.add("Buffalo");
          S_13.add("per Litre");
          S_13.add("");
          S_13.add("");
          S_13.add("");

          ArrayList<String> S_14 = new ArrayList<String>();
          S_14.add("14");
          S_14.add("161");
          S_14.add("Shishu-ahar");
          S_14.add("Lacktogen/Amul/other");
          S_14.add("500 gram");
          S_14.add("");
          S_14.add("");
          S_14.add("");


          ArrayList<String> S_15 = new ArrayList<String>();
          S_15.add("15");
          S_15.add("162");
          S_15.add("Milk Powder");
          S_15.add("");
          S_15.add("500 gram");
          S_15.add("");
          S_15.add("");
          S_15.add("");

          ArrayList<String> S_16 = new ArrayList<String>();
          S_16.add("16");
          S_16.add("163");
          S_16.add("Dahi");
          S_16.add("Jama");
          S_16.add("per litre");
          S_16.add("");
          S_16.add("");
          S_16.add("");


          List<ArrayList<String>> Milk= new ArrayList<ArrayList<String>>();     //1-9
          Milk.add(S_13);
          Milk.add(S_14);
          Milk.add(S_15);
          Milk.add(S_16);


          ArrayList<String> S_17 = new ArrayList<String>();
          S_17.add("17");
          S_17.add("181");
          S_17.add("Mustard Oil");
          S_17.add("Open");
          S_17.add("per litre");
          S_17.add("");
          S_17.add("");
          S_17.add("");

          ArrayList<String> S_18 = new ArrayList<String>();
          S_18.add("18");
          S_18.add("183");
          S_18.add("Coconut Oil");
          S_18.add("Closed Box");
          S_18.add("100 gram");
          S_18.add("");
          S_18.add("");
          S_18.add("");

          ArrayList<String> S_19 = new ArrayList<String>();
          S_19.add("19");
          S_19.add("164");
          S_19.add("Ghee");
          S_19.add("Desi Ghee");
          S_19.add("per kg");
          S_19.add("");
          S_19.add("");
          S_19.add("");

          ArrayList<String> S_20 = new ArrayList<String>();
          S_20.add("20");
          S_20.add("165");
          S_20.add("Butter");
          S_20.add("Prayag/other");
          S_20.add("50 gram");
          S_20.add("");
          S_20.add("");
          S_20.add("");

          ArrayList<String> S_21 = new ArrayList<String>();
          S_21.add("21");
          S_21.add("180");
          S_21.add("Vanspati Ghee");
          S_21.add("Branded");
          S_21.add("per litre");
          S_21.add("");
          S_21.add("");
          S_21.add("");

          List<ArrayList<String>> Eatable_Oil= new ArrayList<ArrayList<String>>();
          Eatable_Oil.add(S_17);
          Eatable_Oil.add(S_18);
          Eatable_Oil.add(S_19);
          Eatable_Oil.add(S_20);
          Eatable_Oil.add(S_21);

          ArrayList<String> S_22 = new ArrayList<String>();
          S_22.add("22");
          S_22.add("220");
          S_22.add("Banana");
          S_22.add("");
          S_22.add("per Dozen");
          S_22.add("");
          S_22.add("");
          S_22.add("");

          ArrayList<String> S_23 = new ArrayList<String>();
          S_23.add("23");
          S_23.add("228");
          S_23.add("Orange/mossmbi ");
          S_23.add("");
          S_23.add("per dozen");
          S_23.add("");
          S_23.add("");
          S_23.add("");
          ArrayList<String> S_24 = new ArrayList<String>();
          S_24.add("24");
          S_24.add("230");
          S_24.add("Papaya");
          S_24.add("");
          S_24.add("per kg");
          S_24.add("");
          S_24.add("");
          S_24.add("");
          ArrayList<String> S_25 = new ArrayList<String>();
          S_25.add("25");
          S_25.add("231");
          S_25.add("Mango");
          S_25.add("Branded");
          S_25.add("per kg");
          S_25.add("");
          S_25.add("");
          S_25.add("");
          ArrayList<String> S_26 = new ArrayList<String>();
          S_26.add("26");
          S_26.add("236");
          S_26.add("Apple");
          S_26.add("");
          S_26.add("per kg");
          S_26.add("");
          S_26.add("");
          S_26.add("");
          ArrayList<String> S_27 = new ArrayList<String>();
          S_27.add("27");
          S_27.add("237");
          S_27.add("Grapes");
          S_27.add("");
          S_27.add("per kg");
          S_27.add("");
          S_27.add("");
          S_27.add("");
          ArrayList<String> S_28 = new ArrayList<String>();
          S_28.add("28");
          S_28.add("240");
          S_28.add("Coconut");
          S_28.add("Dry/Medium");
          S_28.add("per kg");
          S_28.add("");
          S_28.add("");
          S_28.add("");
          ArrayList<String> S_29 = new ArrayList<String>();
          S_29.add("29");
          S_29.add("241");
          S_29.add("Peanut");
          S_29.add("Dana");
          S_29.add("per Kg");
          S_29.add("");
          S_29.add("");
          S_29.add("");
          ArrayList<String> S_30 = new ArrayList<String>();
          S_30.add("30");
          S_30.add("243");
          S_30.add("Kaju");
          S_30.add("");
          S_30.add("per 100 gram");
          S_30.add("");
          S_30.add("");
          S_30.add("");
          ArrayList<String> S_31 = new ArrayList<String>();
          S_31.add("31");
          S_31.add("246");
          S_31.add("Kishmish");
          S_31.add("");
          S_31.add("per 100 gram");
          S_31.add("");
          S_31.add("");
          S_31.add("");
          List<ArrayList<String>> Fruits_Mewa= new ArrayList<ArrayList<String>>();     //1-9
          Fruits_Mewa.add(S_22);
          Fruits_Mewa.add(S_23);
          Fruits_Mewa.add(S_24);
          Fruits_Mewa.add(S_25);
          Fruits_Mewa.add(S_26);
          Fruits_Mewa.add(S_27);
          Fruits_Mewa.add(S_28);
          Fruits_Mewa.add(S_29);
          Fruits_Mewa.add(S_30);
          Fruits_Mewa.add(S_31);


          ArrayList<String> S_32 = new ArrayList<String>();
          S_32.add("32");
          S_32.add("200");
          S_32.add("Potatoes");
          S_32.add("Desi/ Pahadi");
          S_32.add("per kg");
          S_32.add("");
          S_32.add("");
          S_32.add("");
          ArrayList<String> S_33 = new ArrayList<String>();
          S_33.add("33");
          S_33.add("201");
          S_33.add("Onion");
          S_33.add("Dry");
          S_33.add("per kg");
          S_33.add("");
          S_33.add("");
          S_33.add("");
          ArrayList<String> S_34 = new ArrayList<String>();
          S_34.add("33");
          S_34.add("204");
          S_34.add("Mooli");
          S_34.add("Normal");
          S_34.add("per kg");
          S_34.add("");
          S_34.add("");
          S_34.add("");
          ArrayList<String> S_35 = new ArrayList<String>();
          S_35.add("35");
          S_35.add("250");
          S_35.add("Ginger");
          S_35.add("");
          S_35.add("per kg");
          S_35.add("");
          S_35.add("");
          S_35.add("");
          ArrayList<String> S_36 = new ArrayList<String>();
          S_36.add("36");
          S_36.add("251");
          S_36.add("Lahsun");
          S_36.add("");
          S_36.add("per kg");
          S_36.add("");
          S_36.add("");
          S_36.add("");
          ArrayList<String> S_37 = new ArrayList<String>();
          S_37.add("37");
          S_37.add("206");
          S_37.add("Palak/Rai/Methi");
          S_37.add("");
          S_37.add("per kg");
          S_37.add("");
          S_37.add("");
          S_37.add("");
          ArrayList<String> S_38 = new ArrayList<String>();
          S_38.add("38");
          S_38.add("202");
          S_38.add("Tomato");
          S_38.add("");
          S_38.add("per kg");
          S_38.add("");
          S_38.add("");
          S_38.add("");
          ArrayList<String> S_39 = new ArrayList<String>();
          S_39.add("32");
          S_39.add("203");
          S_39.add("Brinjal");
          S_39.add("Long");
          S_39.add("per kg");
          S_39.add("");
          S_39.add("");
          S_39.add("");
          ArrayList<String> S_40 = new ArrayList<String>();
          S_40.add("39");
          S_40.add("207");
          S_40.add("Hari Mirch");
          S_40.add("");
          S_40.add("per kg");
          S_40.add("");
          S_40.add("");
          S_40.add("");
          ArrayList<String> S_41 = new ArrayList<String>();
          S_41.add("41");
          S_41.add("208");
          S_41.add("Lady Finger");
          S_41.add("");
          S_41.add("per kg");
          S_41.add("");
          S_41.add("");
          S_41.add("");
          ArrayList<String> S_42 = new ArrayList<String>();
          S_42.add("42");
          S_42.add("211");
          S_42.add(" Cauliflower");
          S_42.add("");
          S_42.add("per kg");
          S_42.add("");
          S_42.add("");
          S_42.add("");
          ArrayList<String> S_43 = new ArrayList<String>();
          S_43.add("43");
          S_43.add("212");
          S_43.add("Band Gobi");
          S_43.add("");
          S_43.add("per kg");
          S_43.add("");
          S_43.add("");
          S_43.add("");
          ArrayList<String> S_44 = new ArrayList<String>();
          S_44.add("44");
          S_44.add("213");
          S_44.add("Kadu/Kashifal/Loki");
          S_44.add("Green");
          S_44.add("per kg");
          S_44.add("");
          S_44.add("");
          S_44.add("");
          ArrayList<String> S_45 = new ArrayList<String>();
          S_45.add("45");
          S_45.add("214");
          S_45.add("Pea");
          S_45.add("Green");
          S_45.add("per kg");
          S_45.add("");
          S_45.add("");
          S_45.add("");
          ArrayList<String> S_46 = new ArrayList<String>();
          S_46.add("46");
          S_46.add("294");
          S_46.add("Pickle");
          S_46.add("Mix");
          S_46.add("100 gram");
          S_46.add("");
          S_46.add("");
          S_46.add("");


          List<ArrayList<String>> Vegetables_and_Pickles= new ArrayList<ArrayList<String>>();
          Vegetables_and_Pickles.add(S_32);
          Vegetables_and_Pickles.add(S_33);
          Vegetables_and_Pickles.add(S_34);
          Vegetables_and_Pickles.add(S_35);
          Vegetables_and_Pickles.add(S_36);
          Vegetables_and_Pickles.add(S_37);
          Vegetables_and_Pickles.add(S_38);
          Vegetables_and_Pickles.add(S_39);
          Vegetables_and_Pickles.add(S_40);
          Vegetables_and_Pickles.add(S_41);
          Vegetables_and_Pickles.add(S_42);
          Vegetables_and_Pickles.add(S_43);
          Vegetables_and_Pickles.add(S_44);
          Vegetables_and_Pickles.add(S_45);
          Vegetables_and_Pickles.add(S_46);



          ArrayList<String> S_47 = new ArrayList<String>();
          S_47.add("47");
          S_47.add("140");
          S_47.add("Arhar Daal");
          S_47.add("Normal");
          S_47.add("per Kg");
          S_47.add("");
          S_47.add("");
          S_47.add("");
          ArrayList<String> S_48 = new ArrayList<String>();
          S_48.add("48");
          S_48.add("141");
          S_48.add("Chana Daal");
          S_48.add("Normal");
          S_48.add("per Kg");
          S_48.add("");
          S_48.add("");
          S_48.add("");
          ArrayList<String> S_49 = new ArrayList<String>();
          S_49.add("49");
          S_49.add("142");
          S_49.add("Chana Sabut-Desi");
          S_49.add("Normal");
          S_49.add("per Kg");
          S_49.add("");
          S_49.add("");
          S_49.add("");
          ArrayList<String> S_50 = new ArrayList<String>();
          S_50.add("50");
          S_50.add("143");
          S_50.add("Moong Daal");
          S_50.add("Medium Chilkedar");
          S_50.add("per Kg");
          S_50.add("");
          S_50.add("");
          S_50.add("");
          ArrayList<String> S_51 = new ArrayList<String>();
          S_51.add("51");
          S_51.add("144");
          S_51.add("Masoor Daal");
          S_51.add("Desi/Medium/Malka");
          S_51.add("per Kg");
          S_51.add("");
          S_51.add("");
          S_51.add("");
          ArrayList<String> S_52 = new ArrayList<String>();
          S_52.add("52");
          S_52.add("145");
          S_52.add("Urad Daal(Black/Green)");
          S_52.add("Medium Bina Dhuli");
          S_52.add("per Kg");
          S_52.add("");
          S_52.add("");
          S_52.add("");
          ArrayList<String> S_53 = new ArrayList<String>();
          S_53.add("53");
          S_53.add("151");
          S_53.add("Besan");
          S_53.add("Chane ki Daal");
          S_53.add("per Kg");
          S_53.add("");
          S_53.add("");
          S_53.add("");
          List<ArrayList<String>> Pulses = new ArrayList<ArrayList<String>>();
          Pulses.add(S_47);
          Pulses.add(S_48);
          Pulses.add(S_49);
          Pulses.add(S_50);
          Pulses.add(S_51);
          Pulses.add(S_52);
          Pulses.add(S_53);


          ArrayList<String> S_54 = new ArrayList<String>();
          S_54.add("54");
          S_54.add("171");
          S_54.add("Sugar P.D.S");
          S_54.add("Medium");
          S_54.add("per Kg");
          S_54.add("");
          S_54.add("");
          S_54.add("");
          ArrayList<String> S_55 = new ArrayList<String>();
          S_55.add("55");
          S_55.add("172");
          S_55.add("Sugar any ");
          S_55.add("Medium");
          S_55.add("per Kg");
          S_55.add("");
          S_55.add("");
          S_55.add("");
          ArrayList<String> S_56 = new ArrayList<String>();
          S_56.add("56");
          S_56.add("173");
          S_56.add("Gud");
          S_56.add("Ladoo/Paari");
          S_56.add("per Kg");
          S_56.add("");
          S_56.add("");
          S_56.add("");
          ArrayList<String> S_57 = new ArrayList<String>();
          S_57.add("57");
          S_57.add("175");
          S_57.add("Honey");
          S_57.add("");
          S_57.add("per Kg");
          S_57.add("");
          S_57.add("");
          S_57.add("");
          List<ArrayList<String>> Sugar_Honey = new ArrayList<ArrayList<String>>();
          Sugar_Honey.add(S_54);
          Sugar_Honey.add(S_55);
          Sugar_Honey.add(S_56);
          Sugar_Honey.add(S_57);




          ArrayList<String> S_58 = new ArrayList<String>();
          S_58.add("58");
          S_58.add("170");
          S_58.add("Salt ");
          S_58.add("Tata");
          S_58.add("per Kg");
          S_58.add("");
          S_58.add("");
          S_58.add("");
          ArrayList<String> S_59 = new ArrayList<String>();
          S_59.add("58");
          S_59.add("254");
          S_59.add("Turmeric");
          S_59.add("");
          S_59.add("per Kg");
          S_59.add("");
          S_59.add("");
          S_59.add("");
          ArrayList<String> S_60 = new ArrayList<String>();
          S_60.add("60");
          S_60.add("255");
          S_60.add("Black Pepper ");
          S_60.add("");
          S_60.add("per 100 gram");
          S_60.add("");
          S_60.add("");
          S_60.add("");
          ArrayList<String> S_61 = new ArrayList<String>();
          S_61.add("61");
          S_61.add("256");
          S_61.add("Sooki Mirch");
          S_61.add("");
          S_61.add("per Kg");
          S_61.add("");
          S_61.add("");
          S_61.add("");


          List<ArrayList<String>> Salt_and_Spices = new ArrayList<ArrayList<String>>();
          Salt_and_Spices.add(S_58);
          Salt_and_Spices.add(S_59);
          Salt_and_Spices.add(S_60);
          Salt_and_Spices.add(S_61);



          ArrayList<String> S_62 = new ArrayList<String>();
          S_62.add("62");
          S_62.add("271");
          S_62.add("Tea Leaves");
          S_62.add("Branded");
          S_62.add("100 gram");
          S_62.add("");
          S_62.add("");
          S_62.add("");
          ArrayList<String> S_63 = new ArrayList<String>();
          S_63.add("63");
          S_63.add("273");
          S_63.add("Coffee Powder");
          S_63.add("Branded");
          S_63.add("50 gram");
          S_63.add("");
          S_63.add("");

          S_63.add("");


          ArrayList<String> S_64 = new ArrayList<String>();
          S_64.add("64");
          S_64.add("270");
          S_64.add("Tea Cup");
          S_64.add("Ready");
          S_64.add("per piece");
          S_64.add("");
          S_64.add("");
          S_64.add("");



          List<ArrayList<String>> Tea_and_Coffee = new ArrayList<ArrayList<String>>();
          Tea_and_Coffee.add(S_62);
          Tea_and_Coffee.add(S_63);
          Tea_and_Coffee.add(S_64);


          ArrayList<String> S_65 = new ArrayList<String>();
          S_65.add("65");
          S_65.add("272");
          S_65.add("Coffee Cup");
          S_65.add("Ready");
          S_65.add("per piece");
          S_65.add("");
          S_65.add("");
          S_65.add("");
          ArrayList<String> S_66 = new ArrayList<String>();
          S_66.add("66");
          S_66.add("280");
          S_66.add("Pakka Bhojan");
          S_66.add("Normal");
          S_66.add("per plate");
          S_66.add("");
          S_66.add("");
          S_66.add("");

          ArrayList<String> S_67 = new ArrayList<String>();
          S_67.add("67");
          S_67.add("290");
          S_67.add("Ready Sweets/ Cake/Pastry");
          S_67.add("");
          S_67.add("per Kg");
          S_67.add("");
          S_67.add("");
          S_67.add("");

          ArrayList<String> S_68 = new ArrayList<String>();
          S_68.add("68");
          S_68.add("270");
          S_68.add("Namkeen");
          S_68.add("");
          S_68.add("per Kg");
          S_68.add("");
          S_68.add("");
          S_68.add("");

          List<ArrayList<String>> Chai_Nasta_and_Jalpan = new ArrayList<ArrayList<String>>();
          Chai_Nasta_and_Jalpan.add(S_65);
          Chai_Nasta_and_Jalpan.add(S_66);
          Chai_Nasta_and_Jalpan.add(S_67);
          Chai_Nasta_and_Jalpan.add(S_68);


          ArrayList<String> S_69 = new ArrayList<String>();
          S_69.add("69");
          S_69.add("301");
          S_69.add("Pan");
          S_69.add("");
          S_69.add("per piece");
          S_69.add("");
          S_69.add("");
          S_69.add("");

          ArrayList<String> S_70 = new ArrayList<String>();
          S_70.add("70");
          S_70.add("310");
          S_70.add("Bidi");
          S_70.add("");
          S_70.add("25 piece pack");
          S_70.add("");
          S_70.add("");
          S_70.add("");

          ArrayList<String> S_71 = new ArrayList<String>();
          S_71.add("71");
          S_71.add("311");
          S_71.add("Cigarettes");
          S_71.add("Medium");
          S_71.add("20 piece pack");
          S_71.add("");
          S_71.add("");
          S_71.add("");

          List<ArrayList<String>> Smoking = new ArrayList<ArrayList<String>>();
          Smoking.add(S_69);
          Smoking.add(S_70);
          Smoking.add(S_71);


          List<String> Non_Eatable = new ArrayList<String>();
          Non_Eatable.add("Clothes");
          Non_Eatable.add("Shoes,Slipers, etc");
          Non_Eatable.add("House Rent/ Garage Rent");
          Non_Eatable.add("Electricity and Fuel");
          Non_Eatable.add("Furnitur, Electronics and Other");
          Non_Eatable.add("Medicines");
          Non_Eatable.add("Telecom, Transport and Other");
          Non_Eatable.add("Entertainment");
          Non_Eatable.add("Stationary");
          Non_Eatable.add("Others");


          ArrayList<String> S_72 = new ArrayList<String>();
          S_72.add("72");
          S_72.add("350");
          S_72.add("Dhoti Sooti Bina Dhuli(Mardani)");
          S_72.add("Powerloom");
          S_72.add("4.5 meter");
          S_72.add("");
          S_72.add("");

          S_72.add("");


          ArrayList<String> S_73 = new ArrayList<String>();
          S_73.add("73");
          S_73.add("351");
          S_73.add("Saree Jersey Medium");
          S_73.add("33:67");
          S_73.add("4.5 meter");

          S_73.add("");
          S_73.add("");
          S_73.add("");

          ArrayList<String> S_74 = new ArrayList<String>();
          S_74.add("74");
          S_74.add("367");
          S_74.add("Lungi");
          S_74.add("2 meter");
          S_74.add("per piece");

          S_74.add("");
          S_74.add("");
          S_74.add("");

          ArrayList<String> S_75 = new ArrayList<String>();
          S_75.add("75");
          S_75.add("352");
          S_75.add("Shirt");
          S_75.add("Jersey");
          S_75.add("per meter");
          S_75.add("");
          S_75.add("");
          S_75.add("");

          ArrayList<String> S_76 = new ArrayList<String>();
          S_76.add("76");
          S_76.add("353");
          S_76.add("Petikot");
          S_76.add("Jersey");
          S_76.add("per piece");
          S_76.add("");
          S_76.add("");
          S_76.add("");


          ArrayList<String> S_77 = new ArrayList<String>();
          S_77.add("77");
          S_77.add("371");
          S_77.add("Towel");
          S_77.add("Full Size/Medium/Powerloom");
          S_77.add("per piece");
          S_77.add("");
          S_77.add("");
          S_77.add("");

          ArrayList<String> S_78 = new ArrayList<String>();
          S_78.add("78");
          S_78.add("484");
          S_78.add("Dhobi Ki Dhulayi");
          S_78.add("Cotton clothes");
          S_78.add("per cloth");
          S_78.add("");
          S_78.add("");
          S_78.add("");

          ArrayList<String> S_79 = new ArrayList<String>();
          S_79.add("79");
          S_79.add("485");
          S_79.add("Tailor");
          S_79.add("Cotton/Jersey(Full shirt and pant)");
          S_79.add("per pair");
          S_79.add("");
          S_79.add("");
          S_79.add("");


          List<ArrayList<String>> Clothes = new ArrayList<ArrayList<String>>();
          Clothes.add(S_72);
          Clothes.add(S_73);
          Clothes.add(S_74);
          Clothes.add(S_75);
          Clothes.add(S_76);
          Clothes.add(S_77);
          Clothes.add(S_78);
          Clothes.add(S_79);


          ArrayList<String> S_80 = new ArrayList<String>();
          S_80.add("80");
          S_80.add("390");
          S_80.add("Leather Boot and Shoes");
          S_80.add("Bata/ Others");
          S_80.add("per pair");
          S_80.add("");
          S_80.add("");
          S_80.add("");

          ArrayList<String> S_81 = new ArrayList<String>();
          S_81.add("81");
          S_81.add("391");
          S_81.add("Leather Sandals, Slippers, etc");
          S_81.add("Bata/ Others");
          S_81.add("per pair");
          S_81.add("");
          S_81.add("");
          S_81.add("");

          ArrayList<String> S_82 = new ArrayList<String>();
          S_82.add("82");
          S_82.add("390");
          S_82.add("Rubber/P.V.S shoes and slippers");
          S_82.add("Normal");
          S_82.add("per pair");
          S_82.add("");
          S_82.add("");
          S_82.add("");

          List<ArrayList<String>> Shoes = new ArrayList<ArrayList<String>>();
          Shoes.add(S_80);
          Shoes.add(S_81);
          Shoes.add(S_82);




          ArrayList<String> S_83 = new ArrayList<String>();
          S_83.add("83");
          S_83.add("520");
          S_83.add("House Rent");
          S_83.add("per room");
          S_83.add("monthly");
          S_83.add("");
          S_83.add("");
          S_83.add("");
          List<ArrayList<String>> House_rent = new ArrayList<ArrayList<String>>();
          House_rent.add(S_83);


          ArrayList<String> S_84 = new ArrayList<String>();
          S_84.add("84");
          S_84.add("332");
          S_84.add("Electricity");
          S_84.add("100 unit");
          S_84.add("per unit");
          S_84.add("");
          S_84.add("");
          S_84.add("");

          ArrayList<String> S_85 = new ArrayList<String>();
          S_85.add("85");
          S_85.add("338");
          S_85.add("LPG gas(14.2 kg)");
          S_85.add("Indane/ Bharat/ HP");
          S_85.add("per cylinder");
          S_85.add("");
          S_85.add("");
          S_85.add("");

          ArrayList<String> S_86 = new ArrayList<String>();
          S_86.add("86");
          S_86.add("334");
          S_86.add("Mitti Ka Tel");
          S_86.add("White");
          S_86.add("per litre");
          S_86.add("");
          S_86.add("");
          S_86.add("");
          List<ArrayList<String>> Electricity_and_fuel = new ArrayList<ArrayList<String>>();
          Electricity_and_fuel.add(S_84);
          Electricity_and_fuel.add(S_85);
          Electricity_and_fuel.add(S_86);



          ArrayList<String> S_87 = new ArrayList<String>();
          S_87.add("87");
          S_87.add("550");
          S_87.add("Single Bed");
          S_87.add("Wood");
          S_87.add("per piece");
          S_87.add("");
          S_87.add("");
          S_87.add("");
          ArrayList<String> S_88 = new ArrayList<String>();
          S_88.add("88");
          S_88.add("551");
          S_88.add("Cupboard");
          S_88.add("Iron/Medium");
          S_88.add("per piece");
          S_88.add("");
          S_88.add("");
          S_88.add("");

          ArrayList<String> S_89 = new ArrayList<String>();
          S_89.add("89");
          S_89.add("552");
          S_89.add("Chair");
          S_89.add("Normal Wood");
          S_89.add("per piece");
          S_89.add("");
          S_89.add("");
          S_89.add("");

          ArrayList<String> S_90 = new ArrayList<String>();
          S_90.add("90");
          S_90.add("380");
          S_90.add("Bed Cover/ Bedsheet");
          S_90.add("160 X 225 semi");
          S_90.add("per piece");
          S_90.add("");
          S_90.add("");
          S_90.add("");

          ArrayList<String> S_91 = new ArrayList<String>();
          S_91.add("91");
          S_91.add("381");
          S_91.add("Blanket");
          S_91.add("Ghandhi Ashram");
          S_91.add("per piece");
          S_91.add("");
          S_91.add("");
          S_91.add("");

          ArrayList<String> S_92 = new ArrayList<String>();
          S_92.add("92");
          S_92.add("383");
          S_92.add("Curtains");
          S_92.add("");
          S_92.add("per meter");
          S_92.add("");
          S_92.add("");
          S_92.add("");

          ArrayList<String> S_93 = new ArrayList<String>();
          S_93.add("93");
          S_93.add("585");
          S_93.add("Washing Machine");
          S_93.add("Semi-Automatic");
          S_93.add("per piece");
          S_93.add("");
          S_93.add("");
          S_93.add("");

          ArrayList<String> S_94 = new ArrayList<String>();
          S_94.add("94");
          S_94.add("588");
          S_94.add("Refreigerator");
          S_94.add("per 165 litre");
          S_94.add("per piece");
          S_94.add("");
          S_94.add("");
          S_94.add("");

          ArrayList<String> S_95 = new ArrayList<String>();
          S_95.add("95");
          S_95.add("592");
          S_95.add("Other Electric Appliances");
          S_95.add("Induction");
          S_95.add("per piece");
          S_95.add("");
          S_95.add("");
          S_95.add("");

          ArrayList<String> S_96 = new ArrayList<String>();
          S_96.add("96");
          S_96.add("464");
          S_96.add("Glass");
          S_96.add("Normal");
          S_96.add("per dozen");
          S_96.add("");
          S_96.add("");
          S_96.add("");

          ArrayList<String> S_97 = new ArrayList<String>();
          S_97.add("97");
          S_97.add("570");
          S_97.add("Stainless Steat Utensils");
          S_97.add("");
          S_97.add("per Kg");
          S_97.add("");
          S_97.add("");
          S_97.add("");

          ArrayList<String> S_98 = new ArrayList<String>();
          S_98.add("98");
          S_98.add("571");
          S_98.add("Crockery");
          S_98.add("Cheeni Ke");
          S_98.add("6 piece");
          S_98.add("");
          S_98.add("");
          S_98.add("");

          ArrayList<String> S_99 = new ArrayList<String>();
          S_99.add("99");
          S_99.add("572");
          S_99.add("Water Bottle");
          S_99.add("1 litre");
          S_99.add("per piece");
          S_99.add("");
          S_99.add("");
          S_99.add("");

          ArrayList<String> S_100 = new ArrayList<String>();
          S_100.add("100");
          S_100.add("587");
          S_100.add("Pressure Cooker");
          S_100.add("per 5 litre");
          S_100.add("per piece");
          S_100.add("");
          S_100.add("");
          S_100.add("");

          ArrayList<String> S_101 = new ArrayList<String>();
          S_101.add("101");
          S_101.add("441");
          S_101.add("Torch");
          S_101.add("Jeep/everready");
          S_101.add("per piece");
          S_101.add("");
          S_101.add("");
          S_101.add("");

          ArrayList<String> S_102 = new ArrayList<String>();
          S_102.add("102");
          S_102.add("442");
          S_102.add("Lock");
          S_102.add("Normal");
          S_102.add("per piece");
          S_102.add("");
          S_102.add("");
          S_102.add("");


          ArrayList<String> S_103 = new ArrayList<String>();
          S_103.add("103");
          S_103.add("460");
          S_103.add("Electric bulb");
          S_103.add("Philips/Others");
          S_103.add("each");
          S_103.add("");
          S_103.add("");
          S_103.add("");


          ArrayList<String> S_104 = new ArrayList<String>();
          S_104.add("104");
          S_104.add("336");
          S_104.add("Match box");
          S_104.add("");
          S_104.add("per box 50 match stick");
          S_104.add("");
          S_104.add("");
          S_104.add("");

          ArrayList<String> S_105 = new ArrayList<String>();
          S_105.add("105");
          S_105.add("465");
          S_105.add("Plastic bucket");
          S_105.add("20 litres");
          S_105.add("each");
          S_105.add("");
          S_105.add("");
          S_105.add("");
          ArrayList<String> S_106 = new ArrayList<String>();
          S_106.add("106");
          S_106.add("467");
          S_106.add("Detergent soap ");
          S_106.add("Rin");
          S_106.add("250 gm box ");
          S_106.add("");
          S_106.add("");
          S_106.add("");



          List<ArrayList<String>> furniture_electronics = new ArrayList<ArrayList<String>>();
          furniture_electronics.add(S_87);
          furniture_electronics.add(S_88);
          furniture_electronics.add(S_89);
          furniture_electronics.add(S_90);
          furniture_electronics.add(S_90);
          furniture_electronics.add(S_91);
          furniture_electronics.add(S_92);
          furniture_electronics.add(S_93);
          furniture_electronics.add(S_93);
          furniture_electronics.add(S_95);
          furniture_electronics.add(S_96);
          furniture_electronics.add(S_97);
          furniture_electronics.add(S_98);
          furniture_electronics.add(S_99);
          furniture_electronics.add(S_100);
          furniture_electronics.add(S_101);
          furniture_electronics.add(S_102);
          furniture_electronics.add(S_103);
          furniture_electronics.add(S_104);
          furniture_electronics.add(S_105);
          furniture_electronics.add(S_106);




          ArrayList<String> S_107 = new ArrayList<String>();  // variable name as Serial No.
          S_107.add("107");
          S_107.add("420");
          S_107.add("Capsule");
          S_107.add("Amoxicillin 250 mg");
          S_107.add("per 10 capsule");
          S_107.add("");
          S_107.add("");
          S_107.add("");


          List<ArrayList<String>> Medicines = new ArrayList<ArrayList<String>>();
          Medicines.add(S_107);




          ArrayList<String> S_108 = new ArrayList<String>();
          S_108.add("108");
          S_108.add("508");
          S_108.add("Petrol");
          S_108.add("Controlled price");
          S_108.add("per Litre");
          S_108.add("");
          S_108.add("");
          S_108.add("");


          ArrayList<String> S_109 = new ArrayList<String>();  // variable name as Serial No.
          S_109.add("109");
          S_109.add("510");
          S_109.add("Diesel");
          S_109.add("Controlled price");
          S_109.add("per Litre");
          S_109.add("");
          S_109.add("");
          S_109.add("");


          ArrayList<String> S_110 = new ArrayList<String>();
          S_110.add("110");
          S_110.add("502");
          S_110.add("Bus/train ride fare");
          S_110.add("");
          S_110.add("per 100 km");
          S_110.add("");
          S_110.add("");
          S_110.add("");

          ArrayList<String> S_111 = new ArrayList<String>();  // variable name as Serial No.
          S_111.add("111");
          S_111.add("623");
          S_111.add("Mobile phone set");
          S_111.add("Nokia/Others(give name)");
          S_111.add("Each");
          S_111.add("");
          S_111.add("");
          S_111.add("");


          ArrayList<String> S_112 = new ArrayList<String>();
          S_112.add("112");
          S_112.add("490");
          S_112.add("Postal service(post card)");
          S_112.add("Run by government");
          S_112.add("each");
          S_112.add("");
          S_112.add("");
          S_112.add("");




          List<ArrayList<String>> Telecom_and_Transport= new ArrayList<ArrayList<String>>();
          Telecom_and_Transport.add(S_108);
          Telecom_and_Transport.add(S_109);
          Telecom_and_Transport.add(S_110);
          Telecom_and_Transport.add(S_111);
          Telecom_and_Transport.add(S_112);


          ArrayList<String> S_113 = new ArrayList<String>();  // variable name as Serial No.
          S_113.add("113");
          S_113.add("402");
          S_113.add("Newspaper");
          S_113.add("Dainik jagran/Others");
          S_113.add("each");
          S_113.add("");
          S_113.add("");
          S_113.add("");


          ArrayList<String> S_114 = new ArrayList<String>();
          S_114.add("114");
          S_114.add("432");
          S_114.add("Game commodities (bat/ball)");
          S_114.add("");
          S_114.add("all joint");
          S_114.add("");
          S_114.add("");
          S_114.add("");


          ArrayList<String> S_115 = new ArrayList<String>();  // variable name as Serial No.
          S_115.add("115");
          S_115.add("561");
          S_115.add("21 inch color tv");
          S_115.add("L.G./B.P.L./Others");
          S_115.add("Each");
          S_115.add("");
          S_115.add("");
          S_115.add("");

          ArrayList<String> S_116 = new ArrayList<String>();  // variable name as Serial No.
          S_116.add("116");
          S_116.add("437");
          S_116.add("Cable tv rent");
          S_116.add("per connection");
          S_116.add("per month");
          S_116.add("");
          S_116.add("");
          S_116.add("");

          List<ArrayList<String>> Entertainment= new ArrayList<ArrayList<String>>();
          Entertainment.add(S_113);
          Entertainment.add(S_114);
          Entertainment.add(S_115);
          Entertainment.add(S_116);



          ArrayList<String> S_117 = new ArrayList<String>();
          S_117.add("117");
          S_117.add("400");
          S_117.add("Books primary level");
          S_117.add("");
          S_117.add("");
          S_117.add("");
          S_117.add("");
          S_117.add("");
          ArrayList<String> S_118 = new ArrayList<String>();
          S_118.add("118");
          S_118.add("404");
          S_118.add("Copy");
          S_118.add("64 page");
          S_118.add("per dozen");
          S_118.add("");
          S_118.add("");
          S_118.add("");

          List<ArrayList<String>> Statinary = new ArrayList<ArrayList<String>>();     //1-9
          Statinary.add(S_117);
          Statinary.add(S_118);



          ArrayList<String> S_119 = new ArrayList<String>();
          S_119.add("119");
          S_119.add("443");
          S_119.add("Umbrella");
          S_119.add("Ordinary");
          S_119.add("each");
          S_119.add("");
          S_119.add("");
          S_119.add("");

          ArrayList<String> S_120 = new ArrayList<String>();
          S_120.add("120");
          S_120.add("450");
          S_120.add("Bathing soap");
          S_120.add("Lifebuoy/Others(give name)");
          S_120.add("each");
          S_120.add("");
          S_120.add("");
          S_120.add("");


          ArrayList<String> S_121 = new ArrayList<String>();
          S_121.add("121");
          S_121.add("451");
          S_121.add("Tooth paste");
          S_121.add("Colgate etc.");
          S_121.add("per 100 gm");
          S_121.add("");
          S_121.add("");
          S_121.add("");

          ArrayList<String> S_122 = new ArrayList<String>();
          S_122.add("122");
          S_122.add("452");
          S_122.add("Face cream");
          S_122.add("Ponds/Samkach");
          S_122.add("50 gm pack");
          S_122.add("");
          S_122.add("");
          S_122.add("");
          ArrayList<String> S_123 = new ArrayList<String>();
          S_123.add("123");
          S_123.add("453");
          S_123.add("Hair oil");
          S_123.add("Dabur/Amla/Others");
          S_123.add("100 gm pack");
          S_123.add("");
          S_123.add("");
          S_123.add("");

          ArrayList<String> S_124 = new ArrayList<String>();
          S_124.add("124");
          S_124.add("620");
          S_124.add("Wrist watch");
          S_124.add("H.M.T/Others");
          S_124.add("each");
          S_124.add("");
          S_124.add("");
          S_124.add("");


          ArrayList<String> S_125 = new ArrayList<String>();
          S_125.add("125");
          S_125.add("483");
          S_125.add("Hair dresser");
          S_125.add("1-per town region without shave");
          S_125.add("per hair cut");
          S_125.add("");
          S_125.add("");
          S_125.add("");

          List<ArrayList<String>> Other= new ArrayList<ArrayList<String>>();
          Other.add(S_119);
          Other.add(S_120);
          Other.add(S_121);
          Other.add(S_122);
          Other.add(S_123);
          Other.add(S_124);
          Other.add(S_125);



          switch(i) {

               case 0: return Serials_and_its_Production_and_Other_Services;
               case 1: return Meat_and_Fish;
               case 2: return Egg;
               case 3: return Milk;
               case 4: return Eatable_Oil;
               case 5: return Fruits_Mewa;
               case 6:return Vegetables_and_Pickles;
               case 7: return Pulses;
               case 8: return Sugar_Honey;
               case 9: return Salt_and_Spices;
               case 10: return Tea_and_Coffee;
               case 11: return Chai_Nasta_and_Jalpan;
               case 12: return Smoking;
               case 13: return Clothes;
               case 14:return Shoes;
               case 15: return House_rent;
               case 16: return Electricity_and_fuel;
               case 17: return furniture_electronics;
               case 18: return Medicines;
               case 19: return Telecom_and_Transport;
               case 20: return Entertainment;
               case 21: return Statinary;
               case 22: return Other;
               default: List<ArrayList<String>> empt = new ArrayList<ArrayList<String>>(0);
                    return empt;
          }


     }

    /* List<ArrayList<String>> rural_sector(int i)
     {

          ArrayList<String> S_1 = new ArrayList<String>();
          S_1.add ("1");
          S_1.add ("101");
          S_1.add ("rice-PDS");
          S_1.add ("Medium");
          S_1.add ("grams per kg");
          S_1.add ("");
          S_1.add ("");
          S_1.add ("");

          ArrayList<String> S_2 = new ArrayList<String> ();
          S_2.add ("2");
          S_2.add ("102");
          S_2.add ("rice-other sources");
          S_2.add ("Medium");
          S_2.add ("grams per kg");
          S_2.add ("");
          S_2.add ("");
          S_2.add ("");

          ArrayList<String> S_3 = new ArrayList<String> ();
          S_3.add ("3");
          S_3.add ("103");
          S_3.add ("Chirwa-sawdust");
          S_3.add ("Medium");
          S_3.add ("grams per kg");
          S_3.add ("");
          S_3.add ("");
          S_3.add ("");

          ArrayList<String> S_4 = new ArrayList<String> ();
          S_4.add ("4");
          S_4.add ("104");
          S_4.add ("lava");
          S_4.add ("Medium");
          S_4.add ("grams per kg");
          S_4.add ("");
          S_4.add ("");
          S_4.add ("");

          ArrayList <String> S_5 = new ArrayList <String> ();
          S_5.add ("5");
          S_5.add ("106");
          S_5.add ("else (give name)");
          S_5.add ("Medium");
          S_5.add ("grams per kg");
          S_5.add ("");
          S_5.add ("");
          S_5.add ("");

          ArrayList <String> S_6 = new ArrayList <String> ();
          S_6.add ("6");
          S_6.add ("107");
          S_6.add ("1- wheat-pds");
          S_6.add ("white");
          S_6.add ("grams per kg");
          S_6.add ("");
          S_6.add ("");
          S_6.add ("");

          ArrayList <String> S_7 = new ArrayList <String> ();
          S_7.add ("7");
          S_7.add ("108");
          S_7.add ("1- wheat-other sources");
          S_7.add ("white");
          S_7.add ("grams per kg");
          S_7.add ("");
          S_7.add ("");
          S_7.add ("");

          ArrayList <String> S_8 = new ArrayList <String> ();
          S_8.add ("8");
          S_8.add ("108");
          S_8.add ("1- wheat-flour");
          S_8.add ("ordinary");
          S_8.add ("grams per kg");
          S_8.add ("");
          S_8.add ("");
          S_8.add ("");

          ArrayList <String> S_9 = new ArrayList <String> ();
          S_9.add ("9");
          S_9.add ("110");
          S_9.add ("maida");
          S_9.add ("ordinary");
          S_9.add ("grams per kg");
          S_9.add ("");
          S_9.add ("");
          S_9.add ("");

          ArrayList <String> S_10 = new ArrayList <String> ();
          S_10.add ("10");
          S_10.add ("111");
          S_10.add ("suji, rava");
          S_10.add ("ordinary");
          S_10.add ("grams per kg");
          S_10.add ("");
          S_10.add ("");
          S_10.add ("");

          ArrayList <String> S_11 = new ArrayList <String> ();
          S_11.add ("11");
          S_11.add ("112");
          S_11.add ("noodles / sevai");
          S_11.add ("ordinary");
          S_11.add ("grams per kg");
          S_11.add ("");
          S_11.add ("");
          S_11.add ("");

          ArrayList <String> S_12 = new ArrayList <String> ();
          S_12.add ("12");
          S_12.add ("113");
          S_12.add ("bread");
          S_12.add ("ordinary (local)");
          S_12.add ("grams per kg");
          S_12.add ("");
          S_12.add ("");
          S_12.add ("");

          ArrayList <String> S_13 = new ArrayList <String> ();
          S_13.add ("13");
          S_13.add ("114");
          S_13.add ("else (give name)");
          S_13.add ("ordinary");
          S_13.add ("grams per kg");
          S_13.add ("");
          S_13.add ("");
          S_13.add ("");

          ArrayList <String> S_14 = new ArrayList <String> ();
          S_14.add ("14");
          S_14.add ("115");
          S_14.add ("juwar");
          S_14.add ("whip white");
          S_14.add ("grams per kg");
          S_14.add ("");
          S_14.add ("");
          S_14.add ("");

          ArrayList <String> S_15 = new ArrayList <String> ();
          S_15.add ("15");
          S_15.add ("116");
          S_15.add ("bajra");
          S_15.add ("bit medium");
          S_15.add ("grams per kg");
          S_15.add ("");
          S_15.add ("");
          S_15.add ("");

          ArrayList <String> S_16 = new ArrayList <String> ();
          S_16.add ("16");
          S_16.add ("117");
          S_16.add ("Makka");
          S_16.add ("yellow / white (medium)");
          S_16.add ("grams per kg");
          S_16.add ("");
          S_16.add ("");
          S_16.add ("");

          ArrayList <String> S_17 = new ArrayList <String> ();
          S_17.add ("17");
          S_17.add ("118");
          S_17.add ("jo");
          S_17.add ("Dara");
          S_17.add ("grams per kg");
          S_17.add ("");
          S_17.add ("");
          S_17.add ("");

          ArrayList <String> S_18 = new ArrayList <String> ();
          S_18.add ("18");
          S_18.add ("140");
          S_18.add ("arhar dal");
          S_18.add ("ordinary");
          S_18.add ("grams per kg");
          S_18.add ("");
          S_18.add ("");
          S_18.add ("");

          ArrayList <String> S_19 = new ArrayList <String> ();
          S_19.add ("19");
          S_19.add ("141");
          S_19.add ("Chana dal");
          S_19.add ("ordinary");
          S_19.add ("grams per kg");
          S_19.add ("");
          S_19.add ("");
          S_19.add ("");

          ArrayList <String> S_20 = new ArrayList <String> ();
          S_20.add ("20");
          S_20.add ("142");
          S_20.add ("1- Chana saabut-Desi");
          S_20.add ("ordinary");
          S_20.add ("grams per kg");
          S_20.add ("");
          S_20.add ("");
          S_20.add ("");

          ArrayList <String> S_21 = new ArrayList <String> ();
          S_21.add ("21");
          S_21.add ("142");
          S_21.add ("2- Kabuli");
          S_21.add ("ordinary");
          S_21.add ("grams per kg");
          S_21.add ("");
          S_21.add ("");
          S_21.add ("");

          ArrayList <String> S_22 = new ArrayList <String> ();
          S_22.add ("22");
          S_22.add ("143");
          S_22.add ("moong dal");
          S_22.add ("medium peeled");
          S_22.add ("grams per kg");
          S_22.add ("");
          S_22.add ("");
          S_22.add ("");

          ArrayList <String> S_23 = new ArrayList <String> ();
          S_23.add ("23");
          S_23.add ("144");
          S_23.add ("Masoor Dal");
          S_23.add ("desi / medium / stool");
          S_23.add ("grams per kg");
          S_23.add ("");
          S_23.add ("");
          S_23.add ("");

          ArrayList <String> S_24 = new ArrayList <String> ();
          S_24.add ("24");
          S_24.add ("145");
          S_24.add ("urad dal");
          S_24.add ("Medium unshielded");
          S_24.add ("grams per kg");
          S_24.add ("");
          S_24.add ("");
          S_24.add ("");

          ArrayList <String> S_25 = new ArrayList <String> ();
          S_25.add ("25");
          S_25.add ("146");
          S_25.add ("1- Matar daal (without peel)");
          S_25.add ("Medium Size");
          S_25.add ("grams per kg");
          S_25.add ("");
          S_25.add ("");
          S_25.add ("");

          ArrayList <String> S_26 = new ArrayList <String> ();
          S_26.add ("26");
          S_26.add ("146");
          S_26.add ("2- Matar saabut");
          S_26.add ("medium variety");
          S_26.add ("grams per kg");
          S_26.add ("");
          S_26.add ("");
          S_26.add ("");

          ArrayList <String> S_27 = new ArrayList <String> ();
          S_27.add ("27");
          S_27.add ("901");
          S_27.add ("Soybean Large");
          S_27.add ("medium variety");
          S_27.add ("grams per kg");
          S_27.add ("");
          S_27.add ("");
          S_27.add ("");

          ArrayList <String> S_28 = new ArrayList <String> ();
          S_28.add ("28");
          S_28.add ("147");
          S_28.add ("Khesari");
          S_28.add ("medium variety");
          S_28.add ("grams per kg");
          S_28.add ("");
          S_28.add ("");
          S_28.add ("");

          ArrayList <String> S_29 = new ArrayList <String> ();
          S_29.add ("29");
          S_29.add ("148");
          S_29.add ("else (give name)");
          S_29.add ("medium variety");
          S_29.add ("grams per kg");
          S_29.add ("");
          S_29.add ("");
          S_29.add ("");

          ArrayList <String> S_30 = new ArrayList <String> ();
          S_30.add ("30");
          S_30.add ("150");
          S_30.add ("Chana utpaad");
          S_30.add ("medium variety");
          S_30.add ("grams per kg");
          S_30.add ("");
          S_30.add ("");
          S_30.add ("");

          ArrayList <String> S_31 = new ArrayList <String> ();
          S_31.add ("31");
          S_31.add ("151");
          S_31.add ("Besan");
          S_31.add ("gram lentils");
          S_31.add ("grams per kg");
          S_31.add ("");
          S_31.add ("");
          S_31.add ("");

          ArrayList <String> S_32 = new ArrayList <String> ();
          S_32.add ("32");
          S_32.add ("151");
          S_32.add ("else (give name)");
          S_32.add ("");
          S_32.add ("grams per kg");
          S_32.add ("");
          S_32.add ("");
          S_32.add ("");

          ArrayList <String> S_33 = new ArrayList <String> ();
          S_33.add ("33");
          S_33.add ("160");
          S_33.add ("milk liquid");
          S_33.add ("of buffalo");
          S_33.add ("per liter");
          S_33.add ("");
          S_33.add ("");
          S_33.add ("");

          ArrayList <String> S_34 = new ArrayList <String> ();
          S_34.add ("34");
          S_34.add ("161");
          S_34.add ("baby food");
          S_34.add ("Lectrogen / Amul / others");
          S_34.add ("500 gram box");
          S_34.add ("");
          S_34.add ("");
          S_34.add ("");

          ArrayList <String> S_35 = new ArrayList <String> ();
          S_35.add ("35");
          S_35.add ("162");
          S_35.add ("milk powder / condensed");
          S_35.add ("Variety Jai");
          S_35.add ("500 gram box");
          S_35.add ("");
          S_35.add ("");
          S_35.add ("");

          ArrayList <String> S_36 = new ArrayList <String> ();
          S_36.add ("36");
          S_36.add ("163");
          S_36.add ("yogurt");
          S_36.add ("frozen");
          S_36.add ("grams per kg");
          S_36.add ("");
          S_36.add ("");
          S_36.add ("");

          ArrayList <String> S_37 = new ArrayList <String> ();
          S_37.add ("37");
          S_37.add ("164");
          S_37.add ("Ghee");
          S_37.add ("Ghee Desi");
          S_37.add ("grams per kg");
          S_37.add ("");
          S_37.add ("");
          S_37.add ("");

          ArrayList <String> S_38 = new ArrayList <String> ();
          S_38.add ("38");
          S_38.add ("165");
          S_38.add ("butter");
          S_38.add ("Pollen / Other");
          S_38.add ("Pack of 50 grams");
          S_38.add ("");
          S_38.add ("");
          S_38.add ("");

          ArrayList <String> S_39 = new ArrayList <String> ();
          S_39.add ("39");
          S_39.add ("166");
          S_39.add ("ice cream");
          S_39.add ("Medium");
          S_39.add ("50ml");
          S_39.add ("");
          S_39.add ("");
          S_39.add ("");

          ArrayList <String> S_40 = new ArrayList <String> ();
          S_40.add ("40");
          S_40.add ("167");
          S_40.add ("else (give name)");
          S_40.add ("Medium");
          S_40.add ("");
          S_40.add ("");
          S_40.add ("");
          S_40.add ("");

          ArrayList <String> S_41 = new ArrayList <String> ();
          S_41.add ("41");
          S_41.add ("171");
          S_41.add ("Sugar-PDS");
          S_41.add ("Medium");
          S_41.add ("grams per kg");
          S_41.add ("");
          S_41.add ("");
          S_41.add ("");

          ArrayList <String> S_42 = new ArrayList <String> ();
          S_42.add ("42");
          S_42.add ("172");
          S_42.add ("Sugar");
          S_42.add ("Medium");
          S_42.add ("grams per kg");
          S_42.add ("");
          S_42.add ("");
          S_42.add ("");

          ArrayList <String> S_43 = new ArrayList <String> ();
          S_43.add ("43");
          S_43.add ("173");
          S_43.add ("jaggery");
          S_43.add ("laddu / innings");
          S_43.add ("grams per kg");
          S_43.add ("");
          S_43.add ("");
          S_43.add ("");

          ArrayList <String> S_44 = new ArrayList <String> ();
          S_44.add ("44");
          S_44.add ("174");
          S_44.add ("Candy (Mishri)");
          S_44.add ("");
          S_44.add ("100 grams");
          S_44.add ("");
          S_44.add ("");
          S_44.add ("");

          ArrayList <String> S_45 = new ArrayList <String> ();
          S_45.add ("45");
          S_45.add ("175");
          S_45.add ("honey");
          S_45.add ("");
          S_45.add ("grams per kg");
          S_45.add ("");
          S_45.add ("");
          S_45.add ("");

          ArrayList <String> S_46 = new ArrayList <String> ();
          S_46.add ("46");
          S_46.add ("170");
          S_46.add ("1- Salt saabut");
          S_46.add ("");
          S_46.add ("grams per kg");
          S_46.add ("");
          S_46.add ("");
          S_46.add ("");

          ArrayList <String> S_47 = new ArrayList <String> ();
          S_47.add ("47");
          S_47.add ("170");
          S_47.add ("2- salt pisa");
          S_47.add ("Tata");
          S_47.add ("grams per kg");
          S_47.add ("");
          S_47.add ("");
          S_47.add ("");

          ArrayList <String> S_48 = new ArrayList <String> ();
          S_48.add ("48");
          S_48.add ("180");
          S_48.add ("Vegetable Ghee");
          S_48.add ("branded");
          S_48.add ("per liter");
          S_48.add ("");
          S_48.add ("");
          S_48.add ("");

          ArrayList <String> S_49 = new ArrayList <String> ();
          S_49.add ("49");
          S_49.add ("181");
          S_49.add ("mustard oil");
          S_49.add ("open");
          S_49.add ("per liter");
          S_49.add ("");
          S_49.add ("");
          S_49.add ("");

          ArrayList <String> S_50 = new ArrayList <String> ();
          S_50.add ("50");
          S_50.add ("182");
          S_50.add ("Peanut oil");
          S_50.add ("open");
          S_50.add ("per liter");
          S_50.add ("");
          S_50.add ("");
          S_50.add ("");

          ArrayList <String> S_51 = new ArrayList <String> ();
          S_51.add ("51");
          S_51.add ("183");
          S_51.add ("Coconut oil");
          S_51.add ("canned");
          S_51.add ("100 grams");
          S_51.add ("");
          S_51.add ("");
          S_51.add ("");

          ArrayList <String> S_52 = new ArrayList <String> ();
          S_52.add ("52");
          S_52.add ("185");
          S_52.add ("Other (name) palm oil");
          S_52.add ("Variety jay");
          S_52.add ("per liter");
          S_52.add ("");
          S_52.add ("");
          S_52.add ("");

          ArrayList <String> S_53 = new ArrayList <String> ();
          S_53.add ("53");
          S_53.add ("190");
          S_53.add ("egg");
          S_53.add ("Desi / Farm");
          S_53.add ("each");
          S_53.add ("");
          S_53.add ("");
          S_53.add ("");

          ArrayList <String> S_54 = new ArrayList <String> ();
          S_54.add ("54");
          S_54.add ("191");
          S_54.add ("1- fish rohu");
          S_54.add ("Medium");
          S_54.add ("grams per kg");
          S_54.add ("");
          S_54.add ("");
          S_54.add ("");

          ArrayList <String> S_55 = new ArrayList <String> ();
          S_55.add ("55");
          S_55.add ("191");
          S_55.add ("2- fish readin");
          S_55.add ("Medium");
          S_55.add ("grams per kg");
          S_55.add ("");
          S_55.add ("");
          S_55.add ("");

          ArrayList <String> S_56 = new ArrayList <String> ();
          S_56.add ("56");
          S_56.add ("192");
          S_56.add ("meat-goat");
          S_56.add ("including bone");
          S_56.add ("grams per kg");
          S_56.add ("");
          S_56.add ("");
          S_56.add ("");

          ArrayList <String> S_57 = new ArrayList <String> ();
          S_57.add ("57");
          S_57.add ("193");
          S_57.add ("meat-buffalo");
          S_57.add ("including bone");
          S_57.add ("grams per kg");
          S_57.add ("");
          S_57.add ("");
          S_57.add ("");

          ArrayList <String> S_58 = new ArrayList <String> ();
          S_58.add ("58");
          S_58.add ("194");
          S_58.add ("of meat-pig");
          S_58.add ("");
          S_58.add ("grams per kg");
          S_58.add ("");
          S_58.add ("");
          S_58.add ("");

          ArrayList <String> S_59 = new ArrayList <String> ();
          S_59.add ("59");
          S_59.add ("195");
          S_59.add ("chicken (of chicken)");
          S_59.add ("");
          S_59.add ("grams per kg");
          S_59.add ("");
          S_59.add ("");
          S_59.add ("");

          ArrayList <String> S_60 = new ArrayList <String> ();
          S_60.add ("60");
          S_60.add ("196");
          S_60.add ("else (give name)");
          S_60.add ("");
          S_60.add ("grams per kg");
          S_60.add ("");
          S_60.add ("");
          S_60.add ("");

          ArrayList <String> S_61 = new ArrayList <String> ();
          S_61.add ("61");
          S_61.add ("200");
          S_61.add ("potato");
          S_61.add ("Desi / hill");
          S_61.add ("grams per kg");
          S_61.add ("");
          S_61.add ("");
          S_61.add ("");

          ArrayList <String> S_62 = new ArrayList <String> ();
          S_62.add ("62");
          S_62.add ("201");
          S_62.add ("onion");
          S_62.add ("dry");
          S_62.add ("grams per kg");
          S_62.add ("");
          S_62.add ("");
          S_62.add ("");

          ArrayList <String> S_63 = new ArrayList <String> ();
          S_63.add ("63");
          S_63.add ("204");
          S_63.add ("radish");
          S_63.add ("ordinary");
          S_63.add ("grams per kg");
          S_63.add ("");
          S_63.add ("");
          S_63.add ("");

          ArrayList <String> S_64 = new ArrayList <String> ();
          S_64.add ("64");
          S_64.add ("205");
          S_64.add ("carrot");
          S_64.add ("red / yellow");
          S_64.add ("grams per kg");
          S_64.add ("");
          S_64.add ("");
          S_64.add ("");

          ArrayList <String> S_65 = new ArrayList <String> ();
          S_65.add ("65");
          S_65.add ("902");
          S_65.add ("turnip");
          S_65.add ("");
          S_65.add ("grams per kg");
          S_65.add ("");
          S_65.add ("");
          S_65.add ("");

          ArrayList <String> S_66 = new ArrayList <String> ();
          S_66.add ("66");
          S_66.add ("903");
          S_66.add ("Beetroot");
          S_66.add ("");
          S_66.add ("grams per kg");
          S_66.add ("");
          S_66.add ("");
          S_66.add ("");

          ArrayList <String> S_67 = new ArrayList <String> ();
          S_67.add ("67");
          S_67.add ("904");
          S_67.add ("sweet potato");
          S_67.add ("");
          S_67.add ("grams per kg");
          S_67.add ("");
          S_67.add ("");
          S_67.add ("");

          ArrayList <String> S_68 = new ArrayList <String> ();
          S_68.add ("68");
          S_68.add ("905");
          S_68.add ("Arabic");
          S_68.add ("");
          S_68.add ("grams per kg");
          S_68.add ("");
          S_68.add ("");
          S_68.add ("");

          ArrayList <String> S_69 = new ArrayList <String> ();
          S_69.add ("69");
          S_69.add ("213");
          S_69.add ("Kaddu / Kashi fruit");
          S_69.add ("green");
          S_69.add ("grams per kg");
          S_69.add ("");
          S_69.add ("");
          S_69.add ("");

          ArrayList <String> S_70 = new ArrayList <String> ();
          S_70.add ("70");
          S_70.add ("213");
          S_70.add ("Loki");
          S_70.add ("");
          S_70.add ("grams per kg");
          S_70.add ("");
          S_70.add ("");
          S_70.add ("");

          ArrayList <String> S_71 = new ArrayList <String> ();
          S_71.add ("71");
          S_71.add ("906");
          S_71.add ("karela");
          S_71.add ("");
          S_71.add ("grams per kg");
          S_71.add ("");
          S_71.add ("");
          S_71.add ("");

          ArrayList <String> S_72 = new ArrayList <String> ();
          S_72.add ("72");
          S_72.add ("907");
          S_72.add ("Cucumber / Cucumber");
          S_72.add ("name it");
          S_72.add ("each piece");
          S_72.add ("");
          S_72.add ("");
          S_72.add ("");

          ArrayList <String> S_73 = new ArrayList <String> ();
          S_73.add ("73");
          S_73.add ("210");
          S_73.add ("Parval / Table");
          S_73.add ("");
          S_73.add ("grams per kg");
          S_73.add ("");
          S_73.add ("");
          S_73.add ("");

          ArrayList <String> S_74 = new ArrayList <String> ();
          S_74.add ("74");
          S_74.add ("908");
          S_74.add ("Zhiga / Taroi / Ninevah");
          S_74.add ("");
          S_74.add ("grams per kg");
          S_74.add ("");
          S_74.add ("");
          S_74.add ("");

          ArrayList <String> S_75 = new ArrayList <String> ();
          S_75.add ("75");
          S_75.add ("909");
          S_75.add ("chichida");
          S_75.add ("");
          S_75.add ("grams per kg");
          S_75.add ("");
          S_75.add ("");
          S_75.add ("");

          ArrayList <String> S_76 = new ArrayList <String> ();
          S_76.add ("76");
          S_76.add ("910");
          S_76.add ("papaya green");
          S_76.add ("");
          S_76.add ("grams per kg");
          S_76.add ("");
          S_76.add ("");
          S_76.add ("");

          ArrayList <String> S_77 = new ArrayList <String> ();
          S_77.add ("77");
          S_77.add ("211");
          S_77.add ("Cauliflower");
          S_77.add ("");
          S_77.add ("grams per kg");
          S_77.add ("");
          S_77.add ("");
          S_77.add ("");

          ArrayList <String> S_78 = new ArrayList <String> ();
          S_78.add ("78");
          S_78.add ("212");
          S_78.add ("Cabbage off");
          S_78.add ("");
          S_78.add ("grams per kg");
          S_78.add ("");
          S_78.add ("");
          S_78.add ("");

          ArrayList <String> S_79 = new ArrayList <String> ();
          S_79.add ("79");
          S_79.add ("203");
          S_79.add ("brinjal");
          S_79.add ("long / round");
          S_79.add ("grams per kg");
          S_79.add ("");
          S_79.add ("");
          S_79.add ("");

          ArrayList <String> S_80 = new ArrayList <String> ();
          S_80.add ("80");
          S_80.add ("208");
          S_80.add ("LadyFinger");
          S_80.add ("");
          S_80.add ("grams per kg");
          S_80.add ("");
          S_80.add ("");
          S_80.add ("");

          ArrayList <String> S_81 = new ArrayList <String> ();
          S_81.add ("81");
          S_81.add ("206");
          S_81.add ("Spinach / Rye / Fenugreek");
          S_81.add ("");
          S_81.add ("grams per kg");
          S_81.add ("");
          S_81.add ("");
          S_81.add ("");

          ArrayList <String> S_82 = new ArrayList <String> ();
          S_82.add ("82");
          S_82.add ("217");
          S_82.add ("Other (name) beans");
          S_82.add ("");
          S_82.add ("grams per kg");
          S_82.add ("");
          S_82.add ("");
          S_82.add ("");

          ArrayList <String> S_83 = new ArrayList <String> ();
          S_83.add ("83");
          S_83.add ("202");
          S_83.add ("Tomato");
          S_83.add ("cook");
          S_83.add ("grams per kg");
          S_83.add ("");
          S_83.add ("");
          S_83.add ("");

          ArrayList <String> S_84 = new ArrayList <String> ();
          S_84.add ("84");
          S_84.add ("214");
          S_84.add ("Pea");
          S_84.add ("green");
          S_84.add ("grams per kg");
          S_84.add ("");
          S_84.add ("");
          S_84.add ("");

          ArrayList <String> S_85 = new ArrayList <String> ();
          S_85.add ("85");
          S_85.add ("207");
          S_85.add ("chili (green)");
          S_85.add ("");
          S_85.add ("grams per kg");
          S_85.add ("");
          S_85.add ("");
          S_85.add ("");

          ArrayList <String> S_86 = new ArrayList <String> ();
          S_86.add ("86");
          S_86.add ("911");
          S_86.add ("Shimla Mirch");
          S_86.add ("green");
          S_86.add ("grams per kg");
          S_86.add ("");
          S_86.add ("");
          S_86.add ("");

          ArrayList <String> S_87 = new ArrayList <String> ();
          S_87.add ("87");
          S_87.add ("912");
          S_87.add ("Banana Raw");
          S_87.add ("");
          S_87.add ("grams per kg");
          S_87.add ("");
          S_87.add ("");
          S_87.add ("");

          ArrayList <String> S_88 = new ArrayList <String> ();
          S_88.add ("88");
          S_88.add ("913");
          S_88.add ("jackfruit raw");
          S_88.add ("");
          S_88.add ("grams per kg");
          S_88.add ("");
          S_88.add ("");
          S_88.add ("");

          ArrayList <String> S_89 = new ArrayList <String> ();
          S_89.add ("89");
          S_89.add ("216");
          S_89.add ("Lemon");
          S_89.add ("yellow");
          S_89.add ("each");
          S_89.add ("");
          S_89.add ("");
          S_89.add ("");

          ArrayList <String> S_90 = new ArrayList <String> ();
          S_90.add ("90");
          S_90.add ("251");
          S_90.add ("garlic");
          S_90.add ("");
          S_90.add ("grams per kg");
          S_90.add ("");
          S_90.add ("");
          S_90.add ("");

          ArrayList <String> S_91 = new ArrayList <String> ();
          S_91.add ("91");
          S_91.add ("250");
          S_91.add ("Ginger");
          S_91.add ("");
          S_91.add ("grams per kg");
          S_91.add ("");
          S_91.add ("");
          S_91.add ("");

          ArrayList <String> S_92 = new ArrayList <String> ();
          S_92.add ("92");
          S_92.add ("914");
          S_92.add ("Other (give name)");
          S_92.add ("");
          S_92.add ("grams per kg");
          S_92.add ("");
          S_92.add ("");
          S_92.add ("");

          ArrayList <String> S_93 = new ArrayList <String> ();
          S_93.add ("93");
          S_93.add ("220");
          S_93.add ("Banana Cook");
          S_93.add ("");
          S_93.add ("per dozen");
          S_93.add ("");
          S_93.add ("");
          S_93.add ("");

          ArrayList <String> S_94 = new ArrayList <String> ();
          S_94.add ("94");
          S_94.add ("221");
          S_94.add ("Jackfruit Cook");
          S_94.add ("");
          S_94.add ("grams per kg");
          S_94.add ("");
          S_94.add ("");
          S_94.add ("");

          ArrayList <String> S_95 = new ArrayList <String> ();
          S_95.add ("95");
          S_95.add ("222");
          S_95.add ("Watermelon");
          S_95.add ("Medium");
          S_95.add ("grams per kg");
          S_95.add ("");
          S_95.add ("");
          S_95.add ("");

          ArrayList <String> S_96 = new ArrayList <String> ();
          S_96.add ("96");
          S_96.add ("223");
          S_96.add ("Pineapple");
          S_96.add ("Medium");
          S_96.add ("grams per kg");
          S_96.add ("");
          S_96.add ("");
          S_96.add ("");

          ArrayList <String> S_97 = new ArrayList <String> ();
          S_97.add ("97");
          S_97.add ("224");
          S_97.add ("Coconut");
          S_97.add ("Medium");
          S_97.add ("grams per kg");
          S_97.add ("");
          S_97.add ("");
          S_97.add ("");

          ArrayList <String> S_98 = new ArrayList <String> ();
          S_98.add ("98");
          S_98.add ("226");
          S_98.add ("Guava");
          S_98.add ("");
          S_98.add ("grams per kg");
          S_98.add ("");
          S_98.add ("");
          S_98.add ("");

          ArrayList <String> S_99 = new ArrayList <String> ();
          S_99.add ("99");
          S_99.add ("227");
          S_99.add ("Singhada");
          S_99.add ("");
          S_99.add ("grams per kg");
          S_99.add ("");
          S_99.add ("");
          S_99.add ("");

          ArrayList <String> S_100 = new ArrayList <String> ();
          S_100.add ("100");
          S_100.add ("228");
          S_100.add ("1- orange");
          S_100.add ("");
          S_100.add ("per dozen");
          S_100.add ("");
          S_100.add ("");
          S_100.add ("");

          ArrayList <String> S_101 = new ArrayList <String> ();
          S_101.add ("101");
          S_101.add ("228");
          S_101.add ("2- mousambi");
          S_101.add ("");
          S_101.add ("grams per kg");
          S_101.add ("");
          S_101.add ("");
          S_101.add ("");

          ArrayList <String> S_102 = new ArrayList <String> ();
          S_102.add ("102");
          S_102.add ("230");
          S_102.add ("papaya");
          S_102.add ("");
          S_102.add ("grams per kg");
          S_102.add ("");
          S_102.add ("");
          S_102.add ("");

          ArrayList <String> S_103 = new ArrayList <String> ();
          S_103.add ("103");
          S_103.add ("231");
          S_103.add ("Common");
          S_103.add ("");
          S_103.add ("grams per kg");
          S_103.add ("");
          S_103.add ("");
          S_103.add ("");

          ArrayList <String> S_104 = new ArrayList <String> ();
          S_104.add ("104");
          S_104.add ("232");
          S_104.add ("Melon");
          S_104.add ("");
          S_104.add ("grams per kg");
          S_104.add ("");
          S_104.add ("");
          S_104.add ("");

          ArrayList <String> S_105 = new ArrayList <String> ();
          S_105.add ("105");
          S_105.add ("233");
          S_105.add ("pear");
          S_105.add ("");
          S_105.add ("grams per kg");
          S_105.add ("");
          S_105.add ("");
          S_105.add ("");

          ArrayList <String> S_106 = new ArrayList <String> ();
          S_106.add ("106");
          S_106.add ("234");
          S_106.add ("plum / badrifal");
          S_106.add ("");
          S_106.add ("grams per kg");
          S_106.add ("");
          S_106.add ("");
          S_106.add ("");

          ArrayList <String> S_107 = new ArrayList <String> ();
          S_107.add ("107");
          S_107.add ("235");
          S_107.add ("Lychee");
          S_107.add ("");
          S_107.add ("grams per kg");
          S_107.add ("");
          S_107.add ("");
          S_107.add ("");

          ArrayList <String> S_108 = new ArrayList <String> ();
          S_108.add ("108");
          S_108.add ("236");
          S_108.add ("apple");
          S_108.add ("");
          S_108.add ("grams per kg");
          S_108.add ("");
          S_108.add ("");
          S_108.add ("");

          ArrayList <String> S_109 = new ArrayList <String> ();
          S_109.add ("109");
          S_109.add ("237");
          S_109.add ("Grapes");
          S_109.add ("");
          S_109.add ("grams per kg");
          S_109.add ("");
          S_109.add ("");
          S_109.add ("");

          ArrayList <String> S_110 = new ArrayList <String> ();
          S_110.add ("110");
          S_110.add ("238");
          S_110.add ("Other (give name) pomegranate");
          S_110.add ("");
          S_110.add ("grams per kg");
          S_110.add ("");
          S_110.add ("");
          S_110.add ("");

          ArrayList <String> S_111 = new ArrayList <String> ();
          S_111.add ("111");
          S_111.add ("240");
          S_111.add ("Coconut (copra)");
          S_111.add ("dry / medium");
          S_111.add ("grams per kg");
          S_111.add ("");
          S_111.add ("");
          S_111.add ("");

          ArrayList <String> S_112 = new ArrayList <String> ();
          S_112.add ("112");
          S_112.add ("241");
          S_112.add ("Peanut");
          S_112.add ("Dana");
          S_112.add ("grams per kg");
          S_112.add ("");
          S_112.add ("");
          S_112.add ("");

          ArrayList <String> S_113 = new ArrayList <String> ();
          S_113.add ("113");
          S_113.add ("242");
          S_113.add ("date");
          S_113.add ("");
          S_113.add ("per 100 grams");
          S_113.add ("");
          S_113.add ("");
          S_113.add ("");

          ArrayList <String> S_114 = new ArrayList <String> ();
          S_114.add ("114");
          S_114.add ("243");
          S_114.add ("Cashew");
          S_114.add ("");
          S_114.add ("per 100 grams");
          S_114.add ("");
          S_114.add ("");
          S_114.add ("");

          ArrayList <String> S_115 = new ArrayList <String> ();
          S_115.add ("115");
          S_115.add ("244");
          S_115.add ("nut");
          S_115.add ("");
          S_115.add ("per 100 grams");
          S_115.add ("");
          S_115.add ("");
          S_115.add ("");

          ArrayList <String> S_116 = new ArrayList <String> ();
          S_116.add ("116");
          S_116.add ("246");
          S_116.add ("KishMish");
          S_116.add ("");
          S_116.add ("per 100 grams");
          S_116.add ("");
          S_116.add ("");
          S_116.add ("");

          ArrayList <String> S_117 = new ArrayList <String> ();
          S_117.add ("117");
          S_117.add ("247");
          S_117.add ("Other (give name) Dry Almond");
          S_117.add ("");
          S_117.add ("per 100 grams");
          S_117.add ("");
          S_117.add ("");
          S_117.add ("");

          ArrayList <String> S_118 = new ArrayList <String> ();
          S_118.add ("118");
          S_118.add ("254");
          S_118.add ("turmeric");
          S_118.add ("");
          S_118.add ("grams per kg");
          S_118.add ("");
          S_118.add ("");
          S_118.add ("");

          ArrayList <String> S_119 = new ArrayList <String> ();
          S_119.add ("119");
          S_119.add ("255");
          S_119.add ("pepper");
          S_119.add ("");
          S_119.add ("per 100 grams");
          S_119.add ("");
          S_119.add ("");
          S_119.add ("");

          ArrayList <String> S_120 = new ArrayList <String> ();
          S_120.add ("120");
          S_120.add ("256");
          S_120.add ("dry chili");
          S_120.add ("");
          S_120.add ("grams per kg");
          S_120.add ("");
          S_120.add ("");
          S_120.add ("");

          ArrayList <String> S_121 = new ArrayList <String> ();
          S_121.add ("121");
          S_121.add ("257");
          S_121.add ("tamarind");
          S_121.add ("");
          S_121.add ("grams per kg");
          S_121.add ("");
          S_121.add ("");
          S_121.add ("");

          ArrayList <String> S_122 = new ArrayList <String> ();
          S_122.add ("122");
          S_122.add ("258");
          S_122.add ("curry powder");
          S_122.add ("Ashoka / Goldie / Naam De");
          S_122.add ("50 gram packet");
          S_122.add ("");
          S_122.add ("");
          S_122.add ("");

          ArrayList <String> S_123 = new ArrayList <String> ();
          S_123.add ("123");
          S_123.add ("915");
          S_123.add ("garam masala");
          S_123.add ("Ashoka / Goldie / Naam De");
          S_123.add ("50 gram packet");
          S_123.add ("");
          S_123.add ("");
          S_123.add ("");

          ArrayList <String> S_124 = new ArrayList <String> ();
          S_124.add ("124");
          S_124.add ("261");
          S_124.add ("Other (give name) issues (grinds)");
          S_124.add ("Ashoka / Goldie / Naam De");
          S_124.add ("50 gram packet");
          S_124.add ("");
          S_124.add ("");
          S_124.add ("");

          ArrayList <String> S_125 = new ArrayList <String> ();
          S_125.add ("125");
          S_125.add ("270");
          S_125.add ("tea cup");
          S_125.add ("ready");
          S_125.add ("each");
          S_125.add ("");
          S_125.add ("");
          S_125.add ("");

          ArrayList <String> S_126 = new ArrayList <String> ();
          S_126.add ("126");
          S_126.add ("271");
          S_126.add ("tea leaf");
          S_126.add ("branded");
          S_126.add ("100 gram packet");
          S_126.add ("");
          S_126.add ("");
          S_126.add ("");

          ArrayList <String> S_127 = new ArrayList <String> ();
          S_127.add ("127");
          S_127.add ("272");
          S_127.add ("coffee cup");
          S_127.add ("ready");
          S_127.add ("each");
          S_127.add ("");
          S_127.add ("");
          S_127.add ("");

          ArrayList <String> S_128 = new ArrayList <String> ();
          S_128.add ("128");
          S_128.add ("273");
          S_128.add ("coffee powder");
          S_128.add ("branded");
          S_128.add ("50 gram packet");
          S_128.add ("");
          S_128.add ("");
          S_128.add ("");

          ArrayList <String> S_129 = new ArrayList <String> ();
          S_129.add ("129");
          S_129.add ("916");
          S_129.add ("Ice");
          S_129.add ("Silli");
          S_129.add ("grams per kg");
          S_129.add ("");
          S_129.add ("");
          S_129.add ("");

          ArrayList <String> S_130 = new ArrayList <String> ();
          S_130.add ("130");
          S_130.add ("275");
          S_130.add ("soft drink bottle");
          S_130.add ("Pepsi / Coca");
          S_130.add ("per liter");
          S_130.add ("");
          S_130.add ("");
          S_130.add ("");

          ArrayList <String> S_131 = new ArrayList <String> ();
          S_131.add ("131");
          S_131.add ("276");
          S_131.add ("fruit juice shake");
          S_131.add ("Moshammy");
          S_131.add ("200ml");
          S_131.add ("");
          S_131.add ("");
          S_131.add ("");

          ArrayList <String> S_132 = new ArrayList <String> ();
          S_132.add ("132");
          S_132.add ("255");
          S_132.add ("Coconut green");
          S_132.add ("");
          S_132.add ("each");
          S_132.add ("");
          S_132.add ("");
          S_132.add ("");

          ArrayList <String> S_133 = new ArrayList <String> ();
          S_133.add ("133");
          S_133.add ("277");
          S_133.add ("Other (give name)");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");

          ArrayList <String> S_134 = new ArrayList <String> ();
          S_134.add ("134");
          S_134.add ("291");
          S_134.add ("Biscuits");
          S_134.add ("Parle-G / Naam De");
          S_134.add ("100 grams");
          S_134.add ("");
          S_134.add ("");
          S_134.add ("");

          ArrayList <String> S_135 = new ArrayList <String> ();
          S_135.add ("135");
          S_135.add ("292");
          S_135.add ("salty snacks");
          S_135.add ("");
          S_135.add ("grams per kg");
          S_135.add ("");
          S_135.add ("");
          S_135.add ("");

          ArrayList <String> S_136 = new ArrayList <String> ();
          S_136.add ("136");
          S_136.add ("290");
          S_136.add ("ready dessert");
          S_136.add ("1- Jalebi");
          S_136.add ("grams per kg");
          S_136.add ("");
          S_136.add ("");
          S_136.add ("");

          ArrayList <String> S_137 = new ArrayList <String> ();
          S_137.add ("137");
          S_137.add ("290");
          S_137.add ("prepared dessert");
          S_137.add ("2- sweet (give name)");
          S_137.add ("grams per kg");
          S_137.add ("");
          S_137.add ("");
          S_137.add ("");

          ArrayList <String> S_138 = new ArrayList <String> ();
          S_138.add ("138");
          S_138.add ("280");
          S_138.add ("cooked food");
          S_138.add ("ordinary");
          S_138.add ("per thal");
          S_138.add ("");
          S_138.add ("");
          S_138.add ("");

          ArrayList <String> S_139 = new ArrayList <String> ();
          S_139.add ("139");
          S_139.add ("304");
          S_139.add ("1- cake");
          S_139.add ("Medium");
          S_139.add ("each");
          S_139.add ("");
          S_139.add ("");
          S_139.add ("");

          ArrayList <String> S_140 = new ArrayList <String> ();
          S_140.add ("140");
          S_140.add ("304");
          S_140.add ("2-pasty");
          S_140.add ("Medium");
          S_140.add ("each");
          S_140.add ("");
          S_140.add ("");
          S_140.add ("");

          ArrayList <String> S_141 = new ArrayList <String> ();
          S_141.add ("141");
          S_141.add ("294");
          S_141.add ("Pickel");
          S_141.add ("Mix");
          S_141.add ("100 grams");
          S_141.add ("");
          S_141.add ("");
          S_141.add ("");

          ArrayList <String> S_142 = new ArrayList <String> ();
          S_142.add ("142");
          S_142.add ("295");
          S_142.add ("sauce / sauce");
          S_142.add ("Tomato / Chili");
          S_142.add ("100 grams");
          S_142.add ("");
          S_142.add ("");
          S_142.add ("");

          ArrayList <String> S_143 = new ArrayList <String> ();
          S_143.add ("143");
          S_143.add ("295");
          S_143.add ("Murabba / jelly");
          S_143.add ("");
          S_143.add ("100 grams");
          S_143.add ("");
          S_143.add ("");
          S_143.add ("");

          ArrayList <String> S_144 = new ArrayList <String> ();
          S_144.add ("144");
          S_144.add ("296");
          S_144.add ("else (give name)");
          S_144.add ("");
          S_144.add ("");
          S_14.add ("");
          S_144.add ("");
          S_144.add ("");

          List <ArrayList <String>> Foods = new ArrayList <ArrayList <String>> (); // 1-144
          Foods.add (S_1);
          Foods.add (S_2);
          Foods.add (S_3);
          Foods.add (S_4);
          Foods.add (S_5);
          Foods.add (S_6);
          Foods.add (S_7);
          Foods.add (S_8);
          Foods.add (S_9);
          Foods.add (S_10);
          Foods.add (S_11);
          Foods.add (S_12);
          Foods.add (S_13);
          Foods.add (S_14);
          Foods.add (S_15);
          Foods.add (S_16);
          Foods.add (S_17);
          Foods.add (S_18);
          Foods.add (S_19);
          Foods.add (S_20);
          Foods.add (S_21);
          Foods.add (S_22);
          Foods.add (S_23);
          Foods.add (S_24);
          Foods.add (S_25);
          Foods.add (S_26);
          Foods.add (S_27);
          Foods.add (S_28);
          Foods.add (S_29);
          Foods.add (S_30);
          Foods.add (S_31);
          Foods.add (S_32);
          Foods.add (S_33);
          Foods.add (S_34);
          Foods.add (S_35);
          Foods.add (S_36);
          Foods.add (S_37);
          Foods.add (S_38);
          Foods.add (S_39);
          Foods.add (S_40);
          Foods.add (S_41);
          Foods.add (S_42);
          Foods.add (S_43);
          Foods.add (S_44);
          Foods.add (S_45);
          Foods.add (S_46);
          Foods.add (S_47);
          Foods.add (S_48);
          Foods.add (S_49);
          Foods.add (S_50);
          Foods.add (S_51);
          Foods.add (S_52);
          Foods.add (S_53);
          Foods.add (S_54);
          Foods.add (S_55);
          Foods.add (S_56);
          Foods.add (S_57);
          Foods.add (S_58);
          Foods.add (S_59);
          Foods.add (S_60);
          Foods.add (S_61);
          Foods.add (S_62);
          Foods.add (S_63);
          Foods.add (S_64);
          Foods.add (S_65);
          Foods.add (S_66);
          Foods.add (S_67);
          Foods.add (S_68);
          Foods.add (S_69);
          Foods.add (S_70);
          Foods.add (S_71);
          Foods.add (S_72);
          Foods.add (S_73);
          Foods.add (S_74);
          Foods.add (S_75);
          Foods.add (S_76);
          Foods.add (S_77);
          Foods.add (S_78);
          Foods.add (S_79);
          Foods.add (S_80);
          Foods.add (S_81);
          Foods.add (S_82);
          Foods.add (S_83);
          Foods.add (S_84);
          Foods.add (S_85);
          Foods.add (S_86);
          Foods.add (S_87);
          Foods.add (S_88);
          Foods.add (S_89);
          Foods.add (S_90);
          Foods.add (S_91);
          Foods.add (S_92);
          Foods.add (S_93);
          Foods.add (S_94);
          Foods.add (S_95);
          Foods.add (S_96);
          Foods.add (S_97);
          Foods.add (S_98);
          Foods.add (S_99);
          Foods.add (S_100);
          Foods.add (S_101);
          Foods.add (S_102);
          Foods.add (S_103);
          Foods.add (S_104);
          Foods.add (S_105);
          Foods.add (S_106);
          Foods.add (S_107);
          Foods.add (S_108);
          Foods.add (S_109);
          Foods.add (S_110);
          Foods.add (S_111);
          Foods.add (S_112);
          Foods.add (S_113);
          Foods.add (S_114);
          Foods.add (S_115);
          Foods.add (S_116);
          Foods.add (S_117);
          Foods.add (S_118);
          Foods.add (S_119);
          Foods.add (S_120);
          Foods.add (S_121);
          Foods.add (S_122);
          Foods.add (S_123);
          Foods.add (S_124);
          Foods.add (S_125);
          Foods.add (S_126);
          Foods.add (S_127);
          Foods.add (S_128);
          Foods.add (S_129);
          Foods.add (S_130);
          Foods.add (S_131);
          Foods.add (S_132);
          Foods.add (S_133);
          Foods.add (S_134);
          Foods.add (S_135);
          Foods.add (S_136);
          Foods.add (S_137);
          Foods.add (S_138);
          Foods.add (S_139);
          Foods.add (S_140);
          Foods.add (S_141);
          Foods.add (S_142);
          Foods.add (S_143);
          Foods.add (S_144);


          ArrayList <String> S_145 = new ArrayList <String> (); // variable name as Serial No.
          S_145.add ("145");
          S_145.add ("300");
          S_145.add ("Plain Paan");
          S_145.add ("native / qalkatiya");
          S_145.add ("Per Dholi (200)");
          S_145.add ("");
          S_145.add ("");
          S_145.add ("");
          ArrayList <String> S_146 = new ArrayList <String> ();
          S_146.add ("146");
          S_146.add ("301");
          S_146.add ("Tayar Paan");
          S_146.add ("");
          S_146.add ("each");
          S_146.add ("");
          S_146.add ("");
          S_146.add ("");
          ArrayList <String> S_147 = new ArrayList <String> ();
          S_147.add ("147");
          S_147.add ("302");
          S_147.add ("Supari");
          S_147.add ("whole / two piece");
          S_147.add ("grams per kg");
          S_147.add ("");
          S_147.add ("");
          S_147.add ("");
          ArrayList <String> S_148 = new ArrayList <String> ();
          S_148.add ("148");
          S_148.add ("302");
          S_148.add ("chuna");
          S_148.add ("");
          S_148.add ("Packet of 250 grams");
          S_148.add ("");
          S_148.add ("");
          S_148.add ("");

          ArrayList <String> S_149 = new ArrayList <String> ();
          S_149.add ("149");
          S_149.add ("302");
          S_149.add ("Katha");
          S_149.add ("");
          S_149.add ("grams per kg");
          S_149.add ("");
          S_149.add ("");
          S_149.add ("");

          ArrayList <String> S_150 = new ArrayList <String> ();
          S_150.add ("150");
          S_150.add ("917");
          S_150.add ("else (give name)");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          ArrayList <String> S_151 = new ArrayList <String> ();
          S_151.add ("151");
          S_151.add ("310");
          S_151.add ("bidi (name)");
          S_151.add ("");
          S_151.add ("25 bidi bundle");
          S_151.add ("");
          S_151.add ("");
          S_151.add ("");
          ArrayList <String> S_152 = new ArrayList <String> ();
          S_152.add ("152");
          S_152.add ("311");
          S_152.add ("cigarette (give name)");
          S_152.add ("Medium");
          S_152.add ("20 pieces big size");
          S_152.add ("");
          S_152.add ("");
          S_152.add ("");
          ArrayList <String> S_153 = new ArrayList <String> ();
          S_153.add ("153");
          S_153.add ("312");
          S_153.add ("tobacco leaf");
          S_153.add ("");
          S_153.add ("50 grams");
          S_153.add ("");
          S_153.add ("");
          S_153.add ("");

          ArrayList <String> S_154 = new ArrayList <String> ();
          S_154.add ("154");
          S_154.add ("313");
          S_154.add ("snuff");
          S_154.add ("");
          S_154.add ("50 grams");
          S_154.add ("");
          S_154.add ("");
          S_154.add ("");
          ArrayList <String> S_155 = new ArrayList <String> ();
          S_155.add ("155");
          S_155.add ("314");
          S_155.add ("hookah tobacco");
          S_155.add ("");
          S_155.add ("grams per kg");
          S_155.add ("");
          S_155.add ("");
          S_155.add ("");
          ArrayList <String> S_156 = new ArrayList <String> ();
          S_156.add ("156");
          S_156.add ("315");
          S_156.add ("churat / cigar");
          S_156.add ("");
          S_156.add ("each");
          S_156.add ("");
          S_156.add ("");
          S_156.add ("");
          ArrayList <String> S_157 = new ArrayList <String> ();
          S_157.add ("157");
          S_157.add ("316");
          S_157.add ("Jarda / Suti / Kimam");
          S_157.add ("");
          S_157.add ("50 gram pack");
          S_157.add ("");
          S_157.add ("");
          S_157.add ("");

          ArrayList <String> S_158 = new ArrayList <String> ();
          S_158.add ("158");
          S_158.add ("320");
          S_158.add ("weed");
          S_158.add ("");
          S_158.add ("50 grams");
          S_158.add ("");
          S_158.add ("");
          S_158.add ("");

          ArrayList <String> S_159 = new ArrayList <String> ();
          S_159.add ("159");
          S_159.add ("321");
          S_159.add ("Toddy");
          S_159.add ("");
          S_159.add ("per liter");
          S_159.add ("");
          S_159.add ("");
          S_159.add ("");
          ArrayList <String> S_160 = new ArrayList <String> ();
          S_160.add ("160");
          S_160.add ("322");
          S_160.add ("Desi wine");
          S_160.add ("prevalent / colored");
          S_160.add ("per liter");
          S_160.add ("");
          S_160.add ("");
          S_160.add ("");
          ArrayList <String> S_161 = new ArrayList <String> ();
          S_161.add ("161");
          S_161.add ("323");
          S_161.add ("beer");
          S_161.add ("");
          S_161.add ("750ml");
          S_161.add ("");
          S_161.add ("");
          S_161.add ("");
          ArrayList <String> S_162 = new ArrayList <String> ();
          S_162.add ("162");
          S_162.add ("324");
          S_162.add ("Foreign wines");
          S_162.add ("whiskey / rum");
          S_162.add ("180ml");
          S_162.add ("");
          S_162.add ("");
          S_162.add ("");
          List <ArrayList <String>> Substance = new ArrayList <ArrayList <String>> (); // 1-18
          Substance.add (S_145);
          Substance.add (S_146);
          Substance.add (S_147);
          Substance.add (S_148);
          Substance.add (S_149);
          Substance.add (S_150);
          Substance.add (S_151);
          Substance.add (S_152);
          Substance.add (S_153);
          Substance.add (S_154);
          Substance.add (S_155);
          Substance.add (S_156);
          Substance.add (S_157);
          Substance.add (S_158);
          Substance.add (S_159);
          Substance.add (S_160);
          Substance.add (S_161);
          Substance.add (S_162);

          ArrayList <String> S_163 = new ArrayList <String> (); // variable name as Serial No.
          S_163.add ("163");
          S_163.add ("330");
          S_163.add ("coke / charcoal");
          S_163.add ("");
          S_163.add ("grams per kg");
          S_163.add ("");
          S_163.add ("");
          S_163.add ("");
          ArrayList <String> S_164 = new ArrayList <String> ();
          S_164.add ("164");
          S_164.add ("331");
          S_164.add ("firewood / chelia");
          S_164.add ("");
          S_164.add ("per quintal");
          S_164.add ("");
          S_164.add ("");
          S_164.add ("");
          ArrayList <String> S_165 = new ArrayList <String> ();
          S_165.add ("165");
          S_165.add ("332");
          S_165.add ("Light");
          S_165.add ("up to 100 unit level");
          S_165.add ("per unit");
          S_165.add ("");
          S_165.add ("");
          S_165.add ("");
          ArrayList <String> S_166 = new ArrayList <String> ();
          S_166.add ("166");
          S_166.add ("333");
          S_166.add ("Uplay");
          S_166.add ("");
          S_166.add ("per second");
          S_166.add ("");
          S_166.add ("");
          S_166.add ("");

          ArrayList <String> S_167 = new ArrayList <String> ();
          S_167.add ("167");
          S_167.add ("334");
          S_167.add ("Kerosene oil");
          S_167.add ("white");
          S_167.add ("per liter");
          S_167.add ("");
          S_167.add ("");
          S_167.add ("");

          ArrayList <String> S_168 = new ArrayList <String> ();
          S_168.add ("168");
          S_168.add ("335");
          S_168.add ("Kerosene oil-other (name) cessation");
          S_168.add ("white");
          S_168.add ("per liter");
          S_168.add ("");
          S_168.add ("");
          S_168.add ("");
          ArrayList <String> S_169 = new ArrayList <String> ();
          S_169.add ("169");
          S_169.add ("336");
          S_169.add ("matchbox");
          S_169.add ("");
          S_169.add ("50 sticks per box");
          S_169.add ("");
          S_169.add ("");
          S_169.add ("");
          ArrayList <String> S_170 = new ArrayList <String> ();
          S_170.add ("170");
          S_170.add ("338");
          S_170.add ("LPG Gas (14.2 kg)");
          S_170.add ("Indne / India / H0P");
          S_170.add ("per selender");
          S_170.add ("");
          S_170.add ("");
          S_170.add ("");
          ArrayList <String> S_171 = new ArrayList <String> ();
          S_171.add ("171");
          S_171.add ("337");
          S_171.add ("Charcoal");
          S_171.add ("");
          S_171.add ("grams per kg");
          S_171.add ("");
          S_171.add ("");
          S_171.add ("");

          ArrayList <String> S_172 = new ArrayList <String> ();
          S_172.add ("172");
          S_172.add ("341");
          S_172.add ("Candle");
          S_172.add ("");
          S_172.add ("200 gram packet");
          S_172.add ("");
          S_172.add ("");
          S_172.add ("");
          List <ArrayList <String>> Fuel = new ArrayList <ArrayList <String>> (); // 1-10
          Fuel.add (S_163);
          Fuel.add (S_164);
          Fuel.add (S_165);
          Fuel.add (S_166);
          Fuel.add (S_167);
          Fuel.add (S_168);
          Fuel.add (S_169);
          Fuel.add (S_170);
          Fuel.add (S_171);
          Fuel.add (S_172);

          ArrayList <String> S_173 = new ArrayList <String> (); // variable name as Serial No.
          S_173.add ("173");
          S_173.add ("350");
          S_173.add ("Dhoti cotton without dhuli (masculine)");
          S_173.add ("Average powerloom");
          S_173.add ("4.5 liters");
          S_173.add ("");
          S_173.add ("");
          S_173.add ("");
          ArrayList <String> S_174 = new ArrayList <String> ();
          S_174.add ("174");
          S_174.add ("351");
          S_174.add ("Saree Terricot Medium");
          S_174.add ("33:67");
          S_174.add ("4.5 liters");
          S_174.add ("");
          S_174.add ("");
          S_174.add ("");
          ArrayList <String> S_175 = new ArrayList <String> ();
          S_175.add ("175");
          S_175.add ("352");
          S_175.add ("shirt cloth");
          S_175.add ("terikot");
          S_175.add ("per meter");
          S_175.add ("");
          S_175.add ("");
          S_175.add ("");
          ArrayList <String> S_176 = new ArrayList <String> ();
          S_176.add ("176");
          S_176.add ("353");
          S_176.add ("Pant");
          S_176.add ("terricot");
          S_176.add ("per meter");
          S_176.add ("");
          S_176.add ("");
          S_176.add ("");

          ArrayList <String> S_177 = new ArrayList <String> ();
          S_177.add ("177");
          S_177.add ("355");
          S_177.add ("sheet cover");
          S_177.add ("Bhagalpuri");
          S_177.add ("each");
          S_177.add ("");
          S_177.add ("");
          S_177.add ("");

          ArrayList <String> S_178 = new ArrayList <String> ();
          S_178.add ("178");
          S_178.add ("367");
          S_178.add ("lungi");
          S_178.add ("two meters");
          S_178.add ("each");
          S_178.add ("");
          S_178.add ("");
          S_178.add ("");
          ArrayList <String> S_179 = new ArrayList <String> ();
          S_179.add ("179");
          S_179.add ("371");
          S_179.add ("1- Gamcha/Toliya/Rumaal");
          S_179.add ("flower size / medium / powerloom");
          S_179.add ("each");
          S_179.add ("");
          S_179.add ("");
          S_179.add ("");
          ArrayList <String> S_180 = new ArrayList <String> ();
          S_180.add ("180");
          S_180.add ("371");
          S_180.add ("2-towel");
          S_180.add ("flower size / medium / powerloom");
          S_180.add ("each");
          S_180.add ("");
          S_180.add ("");
          S_180.add ("");

          ArrayList <String> S_181 = new ArrayList <String> ();
          S_181.add ("181");
          S_181.add ("371");
          S_181.add ("3- handkerchief");
          S_181.add ("flower size / medium / powerloom");
          S_181.add ("each");
          S_181.add ("");
          S_181.add ("");
          S_181.add ("");

          ArrayList <String> S_182 = new ArrayList <String> ();
          S_182.add ("182");
          S_182.add ("370");
          S_182.add ("Hosiery goods (name)");
          S_182.add ("Medium");
          S_182.add ("each");
          S_182.add ("");
          S_182.add ("");
          S_182.add ("");
          ArrayList <String> S_183 = new ArrayList <String> ();
          S_183.add ("183");
          S_183.add ("918");
          S_183.add ("Stitched Clothing Jeans Pant");
          S_183.add ("Medium");
          S_183.add ("each");
          S_183.add ("");
          S_183.add ("");
          S_183.add ("");
          ArrayList <String> S_184 = new ArrayList <String> ();
          S_184.add ("184");
          S_184.add ("919");
          S_184.add ("turban / safa");
          S_184.add ("Medium");
          S_184.add ("each");
          S_184.add ("");
          S_184.add ("");
          S_184.add ("");
          ArrayList <String> S_185 = new ArrayList <String> ();
          S_185.add ("185");
          S_185.add ("374");
          S_185.add ("knitting wool");
          S_185.add ("CashMillan");
          S_185.add ("per kg");
          S_185.add ("");
          S_185.add ("");
          S_185.add ("");

          ArrayList <String> S_186 = new ArrayList <String> ();
          S_186.add ("186");
          S_186.add ("380");
          S_186.add ("bed cover / sheet");
          S_186.add ("160 cm X225 cm");
          S_186.add ("each");
          S_186.add ("");
          S_186.add ("");
          S_186.add ("");

          ArrayList <String> S_187 = new ArrayList <String> ();
          S_187.add ("187");
          S_187.add ("381");
          S_187.add ("blanket");
          S_187.add ("Gandhi Ashram");
          S_187.add ("each");
          S_187.add ("");
          S_187.add ("");
          S_187.add ("");
          ArrayList <String> S_188 = new ArrayList <String> ();
          S_188.add ("188");
          S_188.add ("382");
          S_188.add ("pillow");
          S_188.add ("Pham");
          S_188.add ("each");
          S_188.add ("");
          S_188.add ("");
          S_188.add ("");
          ArrayList <String> S_189 = new ArrayList <String> ();
          S_189.add ("189");
          S_189.add ("383");
          S_189.add ("Dresses for curtains");
          S_189.add ("Kissam");
          S_189.add ("per meter");
          S_189.add ("");
          S_189.add ("");
          S_189.add ("");
          ArrayList <String> S_190 = new ArrayList <String> ();
          S_190.add ("190");
          S_190.add ("384");
          S_190.add ("Mosquito donator");
          S_190.add ("ordinary / cotton");
          S_190.add ("each");
          S_190.add ("");
          S_190.add ("");
          S_190.add ("");
          ArrayList <String> S_191 = new ArrayList <String> ();
          S_191.add ("191");
          S_191.add ("920");
          S_191.add ("matting");
          S_191.add ("ordinary");
          S_191.add ("per square foot");
          S_191.add ("");
          S_191.add ("");
          S_191.add ("");
          ArrayList <String> S_192 = new ArrayList <String> ();
          S_192.add ("192");
          S_192.add ("921");
          S_192.add ("Rui");
          S_192.add ("native / no fad");
          S_192.add ("grams per kg");
          S_192.add ("");
          S_192.add ("");
          S_192.add ("");
          List <ArrayList <String>> Clothing = new ArrayList <ArrayList <String>> (); // 1-20
          Clothing.add (S_173);
          Clothing.add (S_174);
          Clothing.add (S_175);
          Clothing.add (S_176);
          Clothing.add (S_177);
          Clothing.add (S_178);
          Clothing.add (S_179);
          Clothing.add (S_180);
          Clothing.add (S_181);
          Clothing.add (S_182);
          Clothing.add (S_183);
          Clothing.add (S_184);
          Clothing.add (S_185);
          Clothing.add (S_186);
          Clothing.add (S_187);
          Clothing.add (S_188);
          Clothing.add (S_189);
          Clothing.add (S_190);
          Clothing.add (S_191);
          Clothing.add (S_192);

          ArrayList <String> S_193 = new ArrayList <String> ();
          S_193.add ("193");
          S_193.add ("390");
          S_193.add ("leather boots, boots");
          S_193.add ("Bata / others");
          S_193.add ("copy added");
          S_193.add ("");
          S_193.add ("");
          S_193.add ("");
          ArrayList <String> S_194 = new ArrayList <String> ();
          S_194.add ("194");
          S_194.add ("391");
          S_194.add ("leather sandals, slippers etc.");
          S_194.add ("Bata / others");
          S_194.add ("copy added");
          S_194.add ("");
          S_194.add ("");
          S_194.add ("");
          ArrayList <String> S_195 = new ArrayList <String> ();
          S_195.add ("195");
          S_195.add ("394");
          S_195.add ("Other (name) sports shoes");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");
          ArrayList <String> S_196 = new ArrayList <String> ();
          S_196.add ("196");
          S_196.add ("393");
          S_196.add ("Rubber / pvc shoes slippers");
          S_196.add ("ordinary");
          S_196.add ("copy added");
          S_196.add ("");
          S_196.add ("");
          S_196.add ("");
          List <ArrayList <String>> Shoes = new ArrayList <ArrayList <String>> (); // 1-4
          Shoes.add (S_193);
          Shoes.add (S_194);
          Shoes.add (S_195);
          Shoes.add (S_196);



          ArrayList<String> S_197 = new ArrayList<String> ();
          S_197.add ("197");
          S_197.add ("922");
          S_197.add ("Magazine");
          S_197.add ("Kadambini/Others");
          S_197.add ("Per Item");
          S_197.add ("");
          S_197.add ("");
          S_197.add ("");
          ArrayList<String> S_198 = new ArrayList<String> ();
          S_198.add ("198");
          S_198.add ("402");
          S_198.add ("News Paper");
          S_198.add ("Dainik Jagran/Others");
          S_198.add ("Per item");
          S_198.add ("");
          S_198.add ("");
          S_198.add ("");
          ArrayList <String> S_199 = new ArrayList <String> ();
          S_199.add ("199");
          S_199.add ("430");
          S_199.add ("Cinema Tickets");
          S_199.add ("First Row");
          S_199.add ("Per Item");
          S_199.add ("");
          S_199.add ("");
          S_199.add ("");



          ArrayList <String> S_200 = new ArrayList <String> ();
          S_200.add ("200");
          S_200.add ("432");
          S_200.add ("Sports Item (Bat/Ball)");
          S_200.add ("Joint");
          S_200.add ("");
          S_200.add ("");
          S_200.add ("");
          S_200.add ("");
          ArrayList <String> S_201 = new ArrayList <String> (); // variable name as Serial No.
          S_201.add ("201");
          S_201.add ("433");
          S_201.add ("Club Fees");
          S_201.add ("each");
          S_201.add ("");
          S_201.add ("");
          S_201.add ("");
          S_201.add ("");


          ArrayList <String> S_202 = new ArrayList <String> ();
          S_202.add ("202");
          S_202.add ("434");
          S_202.add ("Entertainment and Hobby Items");
          S_202.add ("each");
          S_202.add ("");
          S_202.add ("");
          S_202.add ("");
          S_202.add ("");



          ArrayList <String> S_203 = new ArrayList <String> (); // variable name as Serial No.
          S_203.add ("203");
          S_203.add ("435");
          S_203.add ("Photo Session");
          S_203.add ("In Colorful Studio");
          S_203.add ("Per dozen copies");
          S_203.add ("");
          S_203.add ("");
          S_203.add ("");


          ArrayList <String> S_204 = new ArrayList <String> ();
          S_204.add ("204");
          S_204.add ("437");
          S_204.add ("Cable TV Rent");
          S_204.add ("Per Connection");
          S_204.add ("Per month");
          S_204.add ("");
          S_204.add ("");
          S_204.add ("");



          ArrayList <String> S_205 = new ArrayList <String> (); // variable name as Serial No.
          S_205.add ("205");
          S_205.add ("438");
          S_205.add ("Others(Name)");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");


          ArrayList <String> S_206 = new ArrayList <String> ();
          S_206.add ("206");
          S_206.add ("440");
          S_206.add ("Prescription Eyeglasses");
          S_206.add ("normal");
          S_206.add ("Per Item");
          S_206.add ("");
          S_206.add ("");
          S_206.add ("");



          ArrayList <String> S_207 = new ArrayList <String> (); // variable name as Serial No.
          S_207.add ("207");
          S_207.add ("441");
          S_207.add ("torch");
          S_207.add ("Jeep/Eveready");
          S_207.add ("Per Item");
          S_207.add ("");
          S_207.add ("");
          S_207.add ("");



          ArrayList <String> S_208 = new ArrayList <String> ();
          S_208.add ("208");
          S_208.add ("442");
          S_208.add ("Lock");
          S_208.add ("normal");
          S_208.add ("Per Item");
          S_208.add ("");
          S_208.add ("");
          S_208.add ("");




          ArrayList <String> S_209 = new ArrayList <String> (); // variable name as Serial No.
          S_209.add ("209");
          S_209.add ("443");
          S_209.add ("Umbrella");
          S_209.add ("Normal");
          S_209.add ("Per Item");
          S_209.add ("");
          S_209.add ("");
          S_209.add ("");

          ArrayList <String> S_210 = new ArrayList <String> ();
          S_210.add ("210");
          S_210.add ("444");
          S_210.add ("Lighter");
          S_210.add ("normal");
          S_210.add ("Per Item");
          S_210.add ("");
          S_210.add ("");
          S_210.add ("");
          ArrayList <String> S_211 = new ArrayList <String> (); // variable name as Serial No.
          S_211.add ("211");
          S_211.add ("450");
          S_211.add ("Bathing Soap");
          S_211.add ("Lifeboy/other(name)");
          S_211.add ("Per Item");
          S_211.add ("");
          S_211.add ("");
          S_211.add ("");


          ArrayList <String> S_212 = new ArrayList <String> ();
          S_212.add ("212");
          S_212.add ("451");
          S_212.add ("1-Toothbrush");
          S_212.add ("Colgate etc");
          S_212.add ("per.");
          S_212.add ("");
          S_212.add ("");
          S_212.add ("");



          ArrayList <String> S_213 = new ArrayList <String> (); // variable name as Serial No.
          S_213.add ("213");
          S_213.add ("451");
          S_213.add ("2- Toothpaste");
          S_213.add ("Colgate, etc.");
          S_213.add ("Per 100 gram");
          S_213.add ("");
          S_213.add ("");
          S_213.add ("");


          ArrayList <String> S_214 = new ArrayList <String> ();
          S_214.add ("214");
          S_214.add ("451");
          S_214.add ("3- Comb");
          S_214.add ("Medium");
          S_214.add ("Per");
          S_214.add ("");
          S_214.add ("");
          S_214.add ("");



          ArrayList <String> S_215 = new ArrayList <String> (); // variable name as Serial No.
          S_215.add ("215");
          S_215.add ("451");
          S_215.add ("1- Talcum Powder");
          S_215.add ("Ponds/equivalent");
          S_215.add ("Per 100 gram");
          S_215.add ("");
          S_215.add ("");
          S_215.add ("");


          ArrayList <String> S_216 = new ArrayList <String> ();
          S_216.add ("216");
          S_216.add ("452");
          S_216.add ("2-Face cream");
          S_216.add ("Ponds/Equivalent");
          S_216.add ("Per 50 gram");
          S_216.add ("");
          S_216.add ("");
          S_216.add ("");



          ArrayList <String> S_217 = new ArrayList <String> (); // variable name as Serial No.
          S_217.add ("217");
          S_217.add ("453");
          S_217.add ("1-Hair Oil");
          S_217.add ("Dabur/Amla/Others");
          S_217.add ("100 gm pack");
          S_217.add ("");
          S_217.add ("");
          S_217.add ("");



          ArrayList <String> S_218 = new ArrayList <String> ();
          S_218.add ("218");
          S_218.add ("453");
          S_218.add ("2-Shampoo");
          S_218.add ("Name");
          S_218.add ("100 gm pack");
          S_218.add ("");
          S_218.add ("");
          S_218.add ("");



          ArrayList <String> S_219 = new ArrayList <String> (); // variable name as Serial No.
          S_219.add ("219");
          S_219.add ("454");
          S_219.add ("Shaving Blade");
          S_219.add ("Topaz/others");
          S_219.add ("Per 5 blade packet");
          S_219.add ("");
          S_219.add ("");
          S_219.add ("");



          ArrayList <String> S_220 = new ArrayList <String> ();
          S_220.add ("220");
          S_220.add ("455");
          S_220.add ("Shaving Cream");
          S_220.add ("Fa/others");
          S_220.add ("100 gram pack");
          S_220.add ("");
          S_220.add ("");
          S_220.add ("");
          ArrayList <String> S_221 = new ArrayList <String> (); // variable name as Serial No.
          S_221.add ("221");
          S_221.add ("456");
          S_221.add ("Sanitary Napkins");
          S_221.add ("Popular");
          S_221.add ("Per Item");
          S_221.add ("");
          S_221.add ("");
          S_221.add ("");


          ArrayList <String> S_222 = new ArrayList <String> ();
          S_222.add ("222");
          S_222.add ("Electric Battery");
          S_222.add ("");
          S_222.add ("Per Item");
          S_222.add ("");
          S_222.add ("");
          S_222.add ("");
          S_222.add ("");



          ArrayList <String> S_223 = new ArrayList <String> (); // variable name as Serial No.
          S_223.add ("223");
          S_223.add ("");
          S_223.add ("Others(Name)");
          S_223.add ("");
          S_223.add ("Per");
          S_223.add ("");
          S_223.add ("");
          S_223.add ("");


          ArrayList <String> S_224 = new ArrayList <String> ();
          S_224.add ("224");
          S_224.add ("463");
          S_224.add ("Kulhad");
          S_224.add ("Normal Size");
          S_224.add ("Per dozen");
          S_224.add ("");
          S_224.add ("");
          S_224.add ("");



          ArrayList <String> S_225 = new ArrayList <String> (); // variable name as Serial No.
          S_225.add ("225");
          S_225.add ("464");
          S_225.add ("Glass tumblers");
          S_225.add ("normal");
          S_225.add ("Per dozen");
          S_225.add ("");
          S_225.add ("");
          S_225.add ("");


          ArrayList <String> S_226 = new ArrayList <String> ();
          S_226.add ("226");
          S_226.add ("465");
          S_226.add ("1- Steel Bucket");
          S_226.add ("10 liter");
          S_226.add ("Per Item");
          S_226.add ("");
          S_226.add ("");
          S_226.add ("");



          ArrayList <String> S_227 = new ArrayList <String> (); // variable name as Serial No.
          S_227.add ("227");
          S_227.add ("");
          S_227.add ("2- Plastic Bucket");
          S_227.add ("20 liter");
          S_227.add ("Per Item");
          S_227.add ("");
          S_227.add ("");
          S_227.add ("");


          ArrayList <String> S_228 = new ArrayList <String> ();
          S_228.add ("228");
          S_228.add ("");
          S_228.add ("3-Baby Feeding Bottle");
          S_228.add ("With Nipple");
          S_228.add ("Per Item");
          S_228.add ("");
          S_228.add ("");
          S_228.add ("");



          ArrayList <String> S_229 = new ArrayList <String> (); // variable name as Serial No.
          S_229.add ("229");
          S_229.add ("466");
          S_229.add ("Wire/Rope");
          S_229.add ("Plastic/Joot");
          S_229.add ("Per Kg");
          S_229.add ("");
          S_229.add ("");
          S_229.add ("");


          ArrayList <String> S_230 = new ArrayList <String> ();
          S_230.add ("230");
          S_230.add ("467");
          S_230.add ("Washing Soap for clothes");
          S_230.add ("Rin");
          S_230.add ("250 gram bar");
          S_230.add ("");
          S_230.add ("");
          S_230.add ("");

          ArrayList <String> S_231 = new ArrayList <String> (); // variable name as Serial No.
          S_231.add ("231");
          S_231.add ("470");
          S_231.add ("Incense stick");
          S_231.add ("");
          S_231.add ("Per Item");
          S_231.add ("");
          S_231.add ("");
          S_231.add ("");


          ArrayList <String> S_232 = new ArrayList <String> ();
          S_232.add ("232");
          S_232.add ("472");
          S_232.add ("1-Insecticide");
          S_232.add ("Type be given");
          S_232.add ("Per Kilogram");
          S_232.add ("");
          S_232.add ("");
          S_232.add ("");



          ArrayList <String> S_233 = new ArrayList <String> (); // variable name as Serial No.
          S_233.add ("233");
          S_233.add ("472");
          S_233.add ("2-acid");
          S_233.add ("Type be given");
          S_233.add ("Per liter");
          S_233.add ("");
          S_233.add ("");
          S_233.add ("");


          ArrayList <String> S_234 = new ArrayList <String> ();
          S_234.add ("234");
          S_234.add ("480");
          S_234.add ("1- Household Servant");
          S_234.add ("");
          S_234.add ("Each, per month");
          S_234.add ("");
          S_234.add ("");
          S_234.add ("");



          ArrayList <String> S_235 = new ArrayList <String> (); // variable name as Serial No.
          S_235.add ("235");
          S_235.add ("480");
          S_235.add ("2- Cook");
          S_235.add ("");
          S_235.add ("Each, per month");
          S_235.add ("");
          S_235.add ("");
          S_235.add ("");


          ArrayList <String> S_236 = new ArrayList <String> ();
          S_236.add ("236");
          S_236.add ("482");
          S_236.add ("3- House Cleaner");
          S_236.add ("");
          S_236.add ("Each, per month");
          S_236.add ("");
          S_236.add ("");
          S_236.add ("");



          ArrayList <String> S_237 = new ArrayList <String> (); // variable name as Serial No.
          S_237.add ("237");
          S_237.add ("483");
          S_237.add ("Barber");
          S_237.add ("1- Urban without beard");
          S_237.add ("Per Hair Cut");
          S_237.add ("");
          S_237.add ("");
          S_237.add ("");



          ArrayList <String> S_238 = new ArrayList <String> ();
          S_238.add ("238");
          S_238.add ("");
          S_238.add ("");
          S_238.add ("2- Rural without beard");
          S_238.add ("Per Hair Cut");
          S_238.add ("");
          S_238.add ("");
          S_238.add ("");



          ArrayList <String> S_239 = new ArrayList <String> (); // variable name as Serial No.
          S_239.add ("239");
          S_239.add ("484");
          S_239.add ("1- Laundry");
          S_239.add ("Suti Cloth");
          S_239.add ("Per Cloth");
          S_239.add ("");
          S_239.add ("");
          S_239.add ("");



          ArrayList <String> S_240 = new ArrayList <String> ();
          S_240.add ("240");
          S_240.add ("484");
          S_240.add ("2- Laundry (COAT)");
          S_240.add ("Woolen/Terracot");
          S_240.add ("Per Suit");
          S_240.add ("");
          S_240.add ("");
          S_240.add ("");
          ArrayList <String> S_241 = new ArrayList <String> (); // variable name as Serial No.
          S_241.add ("241");
          S_241.add ("484");
          S_241.add ("3- Ironing of clothes");
          S_241.add ("Suti/Terracot");
          S_241.add ("Per Cloth");
          S_241.add ("");
          S_241.add ("");
          S_241.add ("");


          ArrayList <String> S_242 = new ArrayList <String> ();
          S_242.add ("242");
          S_242.add ("485");
          S_242.add ("1- Tailor (Shirt)");
          S_242.add ("Suti/Terracot");
          S_242.add ("Per Cloth");
          S_242.add ("");
          S_242.add ("");
          S_242.add ("");



          ArrayList <String> S_243 = new ArrayList <String> (); // variable name as Serial No.
          S_243.add ("243");
          S_243.add ("485");
          S_243.add ("2- Tailor(Pants)");
          S_243.add ("Suti/Terracot");
          S_243.add ("Per Cloth");
          S_243.add ("");
          S_243.add ("");
          S_243.add ("");


          ArrayList <String> S_244 = new ArrayList <String> ();
          S_244.add ("244");
          S_244.add ("485");
          S_244.add ("1- Tailor( Shirt and Pants)");
          S_244.add ("Suti/Terracot");
          S_244.add ("Per Pair");
          S_244.add ("");
          S_244.add ("");
          S_244.add ("");



          ArrayList <String> S_245 = new ArrayList <String> (); // variable name as Serial No.
          S_245.add ("245");
          S_245.add ("490");
          S_245.add ("Mail(Post Card)");
          S_245.add ("Governmental");
          S_245.add ("Per Item");
          S_245.add ("");
          S_245.add ("");
          S_245.add ("");


          ArrayList <String> S_246 = new ArrayList <String> ();
          S_246.add ("246");
          S_246.add ("486");
          S_246.add ("1- Milling - Flour");
          S_246.add ("");
          S_246.add ("Per Kilogram");
          S_246.add ("");
          S_246.add ("");
          S_246.add ("");



          ArrayList <String> S_247 = new ArrayList <String> (); // variable name as Serial No.
          S_247.add ("247");
          S_247.add ("486");
          S_247.add ("2- Milling - Spices");
          S_247.add ("Per Kilogram");
          S_247.add ("");
          S_247.add ("");
          S_247.add ("");
          S_247.add ("");



          ArrayList <String> S_248 = new ArrayList <String> ();
          S_248.add ("248");
          S_248.add ("500");
          S_248.add ("Airplane Fare");
          S_248.add ("general category");
          S_248.add ("Per 100 Kilometer");
          S_248.add ("");
          S_248.add ("");
          S_248.add ("");



          ArrayList <String> S_249 = new ArrayList <String> (); // variable name as Serial No.
          S_249.add ("249");
          S_249.add ("501");
          S_249.add ("Train Fare");
          S_249.add ("1- Express for urban areas");
          S_249.add ("Per 100 Kilometer");
          S_249.add ("");
          S_249.add ("");
          S_249.add ("");



          ArrayList <String> S_250 = new ArrayList <String> ();
          S_250.add ("250");
          S_250.add ("");
          S_250.add ("");
          S_250.add ("2- Express for rural areas");
          S_250.add ("Per 100 Kilometer");
          S_250.add ("");
          S_250.add ("");
          S_250.add ("");
          ArrayList <String> S_251 = new ArrayList <String> (); // variable name as Serial No.
          S_251.add ("251");
          S_251.add ("502");
          S_251.add ("Bus / tram travel Fare");
          S_251.add ("");
          S_251.add ("Per 100 Kilometer");
          S_251.add ("");
          S_251.add ("");
          S_251.add ("");


          ArrayList <String> S_252 = new ArrayList <String> ();
          S_252.add ("252");
          S_252.add ("503");
          S_252.add ("1- Taxi Fare");
          S_252.add ("");
          S_252.add ("Per Kilometer");
          S_252.add ("");
          S_252.add ("");
          S_252.add ("");



          ArrayList <String> S_253 = new ArrayList <String> (); // variable name as Serial No.
          S_253.add ("253");
          S_253.add ("");
          S_253.add ("2- Autorickshaw Fare");
          S_253.add ("");
          S_253.add ("Per Kilometer");
          S_253.add ("");
          S_253.add ("");
          S_253.add ("");


          ArrayList <String> S_254 = new ArrayList <String> ();
          S_254.add ("254");
          S_254.add ("504");
          S_254.add ("1- Steamer Fare");
          S_254.add ("");
          S_254.add ("Per Kilometer");
          S_254.add ("");
          S_254.add ("");
          S_254.add ("");



          ArrayList <String> S_255 = new ArrayList <String> (); // variable name as Serial No.
          S_255.add ("255");
          S_255.add ("");
          S_255.add ("2- Boat Fare");
          S_255.add ("");
          S_255.add ("Per Kilometer");
          S_255.add ("");
          S_255.add ("");
          S_255.add ("");


          ArrayList <String> S_256 = new ArrayList <String> ();
          S_256.add ("256");
          S_256.add ("505");
          S_256.add ("Rickshaw fare(Cycle or Hand)");
          S_256.add ("");
          S_256.add ("Per Kilometerr");
                  S_256.add ("");
          S_256.add ("");
          S_256.add ("");



          ArrayList <String> S_257 = new ArrayList <String> (); // variable name as Serial No.
          S_257.add ("257");
          S_257.add ("506");
          S_257.add ("Horse Wagon");
          S_257.add ("Per Kilometer");
          S_257.add ("");
          S_257.add ("");
          S_257.add ("");
          S_257.add ("");



          ArrayList <String> S_258 = new ArrayList <String> ();
          S_258.add ("258");
          S_258.add ("508");
          S_258.add ("Petrol");
          S_258.add ("Scheduled price");
          S_258.add ("Per Liter");
          S_258.add ("");
          S_258.add ("");
          S_258.add ("");



          ArrayList <String> S_259 = new ArrayList <String> (); // variable name as Serial No.
          S_259.add ("259");
          S_259.add ("510");
          S_259.add ("Diesel");
          S_259.add ("Scheduled price");
          S_259.add ("Per Liter");
          S_259.add ("");
          S_259.add ("");
          S_259.add ("");



          ArrayList <String> S_260 = new ArrayList <String> ();
          S_260.add ("260");
          S_260.add ("511");
          S_260.add ("Lubraction");
          S_260.add ("Scheduled price");
          S_260.add ("Per Liter");
          S_260.add ("");
          S_260.add ("");
          S_260.add ("");


          ArrayList <String> S_261 = new ArrayList <String> (); // variable name as Serial No.
          S_261.add ("261");
          S_261.add ("520");
          S_261.add ("1- House Rent(Actual)");
          S_261.add ("Per permanent room");
          S_261.add ("Monthly");
          S_261.add ("");
          S_261.add ("");
          S_261.add ("");


          ArrayList <String> S_262 = new ArrayList <String> ();
          S_262.add ("262");
          S_262.add ("");
          S_262.add ("2- Garage Rent(Actual)");
          S_262.add ("One Garage");
          S_262.add ("Monthly");
          S_262.add ("");
          S_262.add ("");
          S_262.add ("");



          ArrayList <String> S_263 = new ArrayList <String> (); // variable name as Serial No.
          S_263.add ("263");
          S_263.add ("522");
          S_263.add ("Housing Land Rent");
          S_263.add ("");
          S_263.add ("Sq ft / yearly");
          S_263.add ("");
          S_263.add ("");
          S_263.add ("");


          ArrayList <String> S_264 = new ArrayList <String> ();
          S_264.add ("264");
          S_264.add ("539");
          S_264.add ("House Tax");
          S_264.add ("permanent");
          S_264.add ("Annual / per square foot");
          S_264.add ("");
          S_264.add ("");
          S_264.add ("");



          ArrayList <String> S_265 = new ArrayList <String> (); // variable name as Serial No.
          S_265.add ("265");
          S_265.add ("540");
          S_265.add ("Water charges");
          S_265.add ("");
          S_265.add ("Yearly");
          S_265.add ("");
          S_265.add ("");
          S_265.add ("");


          ArrayList <String> S_266 = new ArrayList <String> ();
          S_266.add ("266");
          S_266.add ("550");
          S_266.add ("Single Bed");
          S_266.add ("Wooden / medium / sunmica");
          S_266.add ("Per Item");
          S_266.add ("");
          S_266.add ("");
          S_266.add ("");



          ArrayList <String> S_267 = new ArrayList <String> (); // variable name as Serial No.
          S_267.add ("267");
          S_267.add ("551");
          S_267.add ("1. Wardrobe");
          S_267.add ("Iron / medium");
                  S_267.add ("Per Item");
          S_267.add ("");
          S_267.add ("");
          S_267.add ("");



          ArrayList <String> S_268 = new ArrayList <String> ();
          S_268.add ("268");
          S_268.add ("");
          S_268.add ("2. Dressing Table");
          S_268.add ("Wooden / medium");
          S_268.add ("Per Item");
          S_268.add ("");
          S_268.add ("");
          S_268.add ("");



          ArrayList <String> S_269 = new ArrayList <String> (); // variable name as Serial No.
          S_269.add ("269");
          S_269.add ("552");
          S_269.add ("1. Chair");
          S_269.add ("Wooden / medium");
          S_269.add ("Per Item");
          S_269.add ("");
          S_269.add ("");
          S_269.add ("");


          ArrayList <String> S_270 = new ArrayList <String> ();
          S_270.add ("270");
          S_270.add ("");
          S_270.add ("2. Stool");
          S_270.add ("Simple/Wooden");
          S_270.add ("Per Item");
          S_270.add ("");
          S_270.add ("");
          S_270.add ("")
          ;
          ArrayList <String> S_271 = new ArrayList <String> (); // variable name as Serial No.
          S_271.add ("271");
          S_271.add ("");
          S_271.add ("3. Bench");
          S_271.add ("Simple/Wooden");
          S_271.add ("Per Item");
          S_271.add ("");
          S_271.add ("");
          S_271.add ("");


          ArrayList <String> S_272 = new ArrayList <String> ();
          S_272.add ("272");
          S_272.add ("");
          S_272.add ("4. Table");
          S_272.add ("simple/wooden");
          S_272.add ("Per Item");
          S_272.add ("");
          S_272.add ("");
          S_272.add ("");



          ArrayList <String> S_273 = new ArrayList <String> (); // variable name as Serial No.
          S_273.add ("273");
          S_273.add ("553");
          S_273.add ("Suitcase");
          S_273.add ("Medium Size/Give Size");
          S_273.add ("Per Item");
          S_273.add ("");
          S_273.add ("");
          S_273.add ("");


          ArrayList <String> S_274 = new ArrayList <String> ();
          S_274.add ("274");
          S_274.add ("554");
          S_274.add ("Cushion");
          S_274.add ("Medium Size");
          S_274.add ("Per Item");
          S_274.add ("");
          S_274.add ("");
          S_274.add ("");



          ArrayList <String> S_275 = new ArrayList <String> (); // variable name as Serial No.
          S_275.add ("275");
          S_275.add ("555");
          S_275.add ("Carpets and Floor Mats");
          S_275.add ("Medium");
          S_275.add ("per square foot");
          S_275.add ("");
          S_275.add ("");
          S_275.add ("");


          ArrayList <String> S_276 = new ArrayList <String> ();
          S_276.add ("276");
          S_276.add ("560");
          S_276.add ("Gramophone and record player");
          S_276.add ("Variety be given");
          S_276.add ("Per Item");
          S_276.add ("");
          S_276.add ("");
          S_276.add ("");



          ArrayList <String> S_277 = new ArrayList <String> (); // variable name as Serial No.
          S_277.add ("277");
          S_277.add ("");
          S_277.add ("Radio (2 Bands)");
          S_277.add ("Variety be given");
          S_277.add ("Per Item");
          S_277.add ("");
          S_277.add ("");
          S_277.add ("");



          ArrayList <String> S_278 = new ArrayList <String> ();
          S_278.add ("278");
          S_278.add ("561");
          S_278.add ("21 inch color tv");
          S_278.add ("LG/BPL/Others");
          S_278.add ("Per Item");
          S_278.add ("");
          S_278.add ("");
          S_278.add ("");



          ArrayList <String> S_279 = new ArrayList <String> (); // variable name as Serial No.
          S_279.add ("279");
          S_279.add ("923");
          S_279.add ("B.C.R./B.C.P./D.V.D.");
          S_279.add ("Give type");
          S_279.add ("Per Item");
          S_279.add ("");
          S_279.add ("");
          S_279.add ("");

          ArrayList <String> S_280 = new ArrayList <String> ();
          S_280.add ("280");
          S_280.add ("563");
          S_280.add ("Camera and photography");
          S_280.add ("Give Type");
          S_280.add ("Per Item");
          S_280.add ("");
          S_280.add ("");
          S_280.add ("");

          ArrayList <String> S_281 = new ArrayList <String> ();
          S_281.add ("281");
          S_281.add ("562");
          S_281.add ("1. Tape Recorder");
          S_281.add ("Give Type");
          S_281.add ("Per Item");
          S_281.add ("");
          S_281.add ("");
          S_281.add ("");

          ArrayList <String> S_282 = new ArrayList <String> (); // variable name as Serial No.
          S_282.add ("282");
          S_282.add ("");
          S_282.add ("CD Player");
          S_282.add ("Give Type");
          S_282.add ("Per Item");
          S_282.add ("");
          S_282.add ("");
          S_282.add ("");






          ArrayList <String> S_283 = new ArrayList <String> (); // variable name as Serial No.
          S_283.add ("283");
          S_283.add ("");
          S_283.add ("Audio / Video CD");
          S_283.add ("Give Type");
          S_283.add ("Per Item");
          S_283.add ("");
          S_283.add ("");
          S_283.add ("");


          ArrayList <String> S_284 = new ArrayList <String> ();
          S_284.add ("284");
          S_284.add ("565");
          S_284.add ("Other device(Name)");
          S_284.add ("Give type");
          S_284.add ("Per Item");
          S_284.add ("");
          S_284.add ("");
          S_284.add ("");



          ArrayList <String> S_285 = new ArrayList <String> (); // variable name as Serial No.
          S_285.add ("285");
          S_285.add ("640");
          S_285.add ("Gold jewelry");
          S_285.add ("22 carat");
          S_285.add ("Per ten gram");
          S_285.add ("");
          S_285.add ("");
          S_285.add ("");


          ArrayList <String> S_286 = new ArrayList <String> ();
          S_286.add ("286");
          S_286.add ("641");
          S_286.add ("Silver jewelry");
          S_286.add ("");
          S_286.add ("Per Kilogram");
          S_286.add ("");
          S_286.add ("");
          S_286.add ("");



          ArrayList <String> S_287 = new ArrayList <String> (); // variable name as Serial No.
          S_287.add ("287");
          S_287.add ("643");
          S_287.add ("Gems (diamond)");
          S_287.add ("Mention Name");
          S_287.add ("Per ratti");
          S_287.add ("");
          S_287.add ("");
          S_287.add ("");



          ArrayList <String> S_288 = new ArrayList <String> ();
          S_288.add ("288");
          S_288.add ("642");
          S_288.add ("Pearl");
          S_288.add ("");
          S_288.add ("Per ratti");
          S_288.add ("");
          S_288.add ("");
          S_288.add ("");



          ArrayList <String> S_289 = new ArrayList <String> (); // variable name as Serial No.
          S_289.add ("289");
          S_289.add ("570");
          S_289.add ("Stainless steel utensils");
          S_289.add ("");
          S_289.add ("Per Kilogram");
          S_289.add ("");
          S_289.add ("");
          S_289.add ("");



          ArrayList <String> S_290 = new ArrayList <String> ();
          S_290.add ("290");
          S_290.add ("572");
          S_290.add ("Water bottle with thermos");
          S_290.add ("of 1 Liter");
          S_290.add ("Per Item");
          S_290.add ("");
          S_290.add ("");
          S_290.add ("");
          ArrayList <String> S_291 = new ArrayList <String> (); // variable name as Serial No.
          S_291.add ("291");
          S_291.add ("571");
          S_291.add ("Other (Name) Kakri");
          S_291.add ("Of sugar");
          S_291.add ("6 pieces");
          S_291.add ("");
          S_291.add ("");
          S_291.add ("");


          ArrayList <String> S_292 = new ArrayList <String> ();
          S_292.add ("292");
          S_292.add ("580");
          S_292.add ("Electric fan");
          S_292.add ("48 inches");
          S_292.add ("Per Item");
          S_292.add ("");
          S_292.add ("");
          S_292.add ("");



          ArrayList <String> S_293 = new ArrayList <String> (); // variable name as Serial No.
          S_293.add ("293");
          S_293.add ("581");
          S_293.add ("air conditioner");
          S_293.add ("Give company name");
          S_293.add ("Per Item");
          S_293.add ("");
          S_293.add ("");
          S_293.add ("");


          ArrayList <String> S_294 = new ArrayList <String> ();
          S_294.add ("294");
          S_294.add ("");
          S_294.add ("Cooler");
          S_294.add ("Give company name");
          S_294.add ("Per Item");
          S_294.add ("");
          S_294.add ("");
          S_294.add ("");



          ArrayList <String> S_295 = new ArrayList <String> (); // variable name as Serial No.
          S_295.add ("295");
          S_295.add ("583");
          S_295.add ("1 lantern");
          S_295.add ("Simple");
          S_295.add ("Per Item");
          S_295.add ("");
          S_295.add ("");
          S_295.add ("");


          ArrayList <String> S_296 = new ArrayList <String> ();
          S_296.add ("296");
          S_296.add ("");
          S_296.add ("2 lamps");
          S_296.add ("Simple");
          S_296.add ("Per Item");
          S_296.add ("");
          S_296.add ("");
          S_296.add ("");



          ArrayList <String> S_297 = new ArrayList <String> (); // variable name as Serial No.
          S_297.add ("297");
          S_297.add ("");
          S_297.add ("3. Electric Lamp shed");
          S_297.add ("Simple");
          S_297.add ("Per item");
          S_297.add ("");
          S_297.add ("");
          S_297.add ("");



          ArrayList <String> S_298 = new ArrayList <String> ();
          S_298.add ("298");
          S_298.add ("584");
          S_298.add ("sewing machine");
          S_298.add ("Usha / Singer / Others");
          S_298.add ("per Item");
          S_298.add ("");
          S_298.add ("");
          S_298.add ("");



          ArrayList <String> S_299 = new ArrayList <String> (); // variable name as Serial No.
          S_299.add ("299");
          S_299.add ("585");
          S_299.add ("Washing machine");
          S_299.add ("Semi Automatic / name");
          S_299.add ("per Item");
          S_299.add ("");
          S_299.add ("");
          S_299.add ("");



          List<ArrayList<String>> Entertainment_And_Other = new ArrayList<ArrayList<String>>();     //200-210
          Entertainment_And_Other.add(S_200);
          Entertainment_And_Other.add(S_201);
          Entertainment_And_Other.add(S_202);
          Entertainment_And_Other.add(S_203);
          Entertainment_And_Other.add(S_204);
          Entertainment_And_Other.add(S_205);
          Entertainment_And_Other.add(S_206);
          Entertainment_And_Other.add(S_207);
          Entertainment_And_Other.add(S_208);
          Entertainment_And_Other.add(S_209);
          Entertainment_And_Other.add(S_210);


          List<ArrayList<String>> Other_Beauty_Product = new ArrayList<ArrayList<String>>();     //210-224

          Other_Beauty_Product.add(S_211);
          Other_Beauty_Product.add(S_212);
          Other_Beauty_Product.add(S_213);
          Other_Beauty_Product.add(S_214);
          Other_Beauty_Product.add(S_215);
          Other_Beauty_Product.add(S_216);
          Other_Beauty_Product.add(S_217);
          Other_Beauty_Product.add(S_218);
          Other_Beauty_Product.add(S_219);
          Other_Beauty_Product.add(S_221);
          Other_Beauty_Product.add(S_222);
          Other_Beauty_Product.add(S_223);
          Other_Beauty_Product.add(S_224);

          List<ArrayList<String>> Utensils = new ArrayList<ArrayList<String>>();     //224-233

          Utensils.add(S_224);
          Utensils.add(S_225);
          Utensils.add(S_226);
          Utensils.add(S_227);
          Utensils.add(S_228);
          Utensils.add(S_229);
          Utensils.add(S_230);
          Utensils.add(S_231);
          Utensils.add(S_232);
          Utensils.add(S_233);

          List<ArrayList<String>> Services = new ArrayList<ArrayList<String>>();     //234-247

          Services.add(S_234);
          Services.add(S_235);
          Services.add(S_236);
          Services.add(S_237);
          Services.add(S_238);
          Services.add(S_239);
          Services.add(S_240);
          Services.add(S_241);
          Services.add(S_242);
          Services.add(S_243);
          Services.add(S_244);
          Services.add(S_245);
          Services.add(S_246);
          Services.add(S_247);

          List<ArrayList<String>> Transportation_Services = new ArrayList<ArrayList<String>>();     //248-260
          Transportation_Services.add(S_248);
          Transportation_Services.add(S_249);
          Transportation_Services.add(S_251);
          Transportation_Services.add(S_252);
          Transportation_Services.add(S_253);
          Transportation_Services.add(S_254);
          Transportation_Services.add(S_255);
          Transportation_Services.add(S_256);
          Transportation_Services.add(S_257);
          Transportation_Services.add(S_258);
          Transportation_Services.add(S_259);
          Transportation_Services.add(S_260);


          List<ArrayList<String>> Rent_And_Loan = new ArrayList<ArrayList<String>>();     //261-265
          Rent_And_Loan.add(S_261);
          Rent_And_Loan.add(S_262);
          Rent_And_Loan.add(S_263);
          Rent_And_Loan.add(S_264);
          Rent_And_Loan.add(S_265);

          List<ArrayList<String>> Other_home_services = new ArrayList<ArrayList<String>>();     //265-284



          Other_home_services.add(S_266);
          Other_home_services.add(S_267);
          Other_home_services.add(S_268);
          Other_home_services.add(S_269);
          Other_home_services.add(S_270);
          Other_home_services.add(S_271);
          Other_home_services.add(S_272);
          Other_home_services.add(S_273);
          Other_home_services.add(S_274);
          Other_home_services.add(S_275);
          Other_home_services.add(S_276);
          Other_home_services.add(S_277);
          Other_home_services.add(S_278);
          Other_home_services.add(S_279);
          Other_home_services.add(S_280);
          Other_home_services.add(S_281);
          Other_home_services.add(S_282);
          Other_home_services.add(S_283);
          Other_home_services.add(S_284);


          List<ArrayList<String>> Jewelry= new ArrayList<ArrayList<String>>();     //284-288
          Jewelry.add(S_285);
          Jewelry.add(S_286);
          Jewelry.add(S_287);
          Jewelry.add(S_288);

          List<ArrayList<String>> Electronics_Utensils_others= new ArrayList<ArrayList<String>>();     //289-299
          Electronics_Utensils_others.add(S_289);
          Electronics_Utensils_others.add(S_290);
          Electronics_Utensils_others.add(S_291);
          Electronics_Utensils_others.add(S_292);
          Electronics_Utensils_others.add(S_293);
          Electronics_Utensils_others.add(S_294);
          Electronics_Utensils_others.add(S_295);
          Electronics_Utensils_others.add(S_296);
          Electronics_Utensils_others.add(S_297);
          Electronics_Utensils_others.add(S_298);
          Electronics_Utensils_others.add(S_299);



          ArrayList <String> S_300 = new ArrayList <String> (); // variable name as Serial No.
          S_300.add ("300");
          S_300.add ("586");
          S_300.add ("stove brass");
          S_300.add ("Mention name");
          S_300.add ("each");
          S_300.add ("");
          S_300.add ("");
          S_300.add ("");


          ArrayList <String> S_301 = new ArrayList <String> (); // variable name as Serial No.
          S_301.add ("301");
          S_301.add ("");
          S_301.add ("2. stove with wick");
          S_301.add ("Mention name");
          S_301.add ("each");
          S_301.add ("");
          S_301.add ("");
          S_301.add ("");


          ArrayList <String> S_302 = new ArrayList <String> ();
          S_302.add ("302");
          S_302.add ("");
          S_302.add ("3. Gas stove");
          S_302.add ("two stove");
          S_302.add ("per cylinder");
          S_302.add ("");
          S_302.add ("");
          S_302.add ("");


          ArrayList <String> S_303 = new ArrayList <String> (); // variable name as Serial No.
          S_303.add ("303");
          S_303.add ("587");
          S_303.add ("pressure cooker");
          S_303.add ("Name per 5 liters");
          S_303.add ("each");
          S_303.add ("");
          S_303.add ("");
          S_303.add ("");



          ArrayList <String> S_304 = new ArrayList <String> ();
          S_304.add ("304");
          S_304.add ("588");
          S_304.add ("Refrigerator (name the company)");
          S_304.add ("per 165 liters");
          S_304.add ("each");
          S_304.add ("");
          S_304.add ("");
          S_304.add ("");



          ArrayList <String> S_305 = new ArrayList <String> (); // variable name as Serial No.
          S_305.add ("305");
          S_305.add ("591");
          S_305.add ("1. electric press");
          S_305.add ("Name");
          S_305.add ("each");
          S_305.add ("");
          S_305.add ("");
          S_305.add ("");


          ArrayList <String> S_306 = new ArrayList <String> ();
          S_306.add ("306");
          S_306.add ("");
          S_306.add ("2. heater");
          S_306.add ("Name");
          S_306.add ("each");
          S_306.add ("");
          S_306.add ("");
          S_306.add ("");



          ArrayList <String> S_307 = new ArrayList <String> (); // variable name as Serial No.
          S_307.add ("307");
          S_307.add ("");
          S_307.add ("3.Toaster");
          S_307.add ("Name");
          S_307.add ("each");
          S_307.add ("");
          S_307.add ("");
          S_307.add ("");


          ArrayList <String> S_308 = new ArrayList <String> ();
          S_308.add ("308");
          S_308.add ("");
          S_308.add ("4. Oven");
          S_308.add ("Name");
          S_308.add ("each");
          S_308.add ("");
          S_308.add ("");
          S_308.add ("");



          ArrayList <String> S_309 = new ArrayList <String> (); // variable name as Serial No.
          S_309.add ("309");
          S_309.add ("592");
          S_309.add ("give other electrical appliances (name) -food cooking / household use");
          S_309.add ("Induction stove (Maharaja white line) / give other name");
          S_309.add ("each");
          S_309.add ("");
          S_309.add ("");
          S_309.add ("");


          ArrayList <String> S_310 = new ArrayList <String> ();
          S_310.add ("310");
          S_310.add ("924");
          S_310.add ("mixer");
          S_310.add ("Mention name");
          S_310.add ("each");
          S_310.add ("");
          S_310.add ("");
          S_310.add ("");



          ArrayList <String> S_311 = new ArrayList <String> (); // variable name as Serial No.
          S_311.add ("311");
          S_311.add ("600");
          S_311.add ("bicycle");
          S_311.add ("Hero / Avon / Name");
          S_311.add ("each");
          S_311.add ("");
          S_311.add ("");
          S_311.add ("");


          ArrayList <String> S_312 = new ArrayList <String> ();
          S_312.add ("312");
          S_312.add ("601");
          S_312.add ("1. Motor Cycle");
          S_312.add ("Hero Honda / Name");
          S_312.add ("each");
          S_312.add ("");
          S_312.add ("");
          S_312.add ("");



          ArrayList <String> S_313 = new ArrayList <String> (); // variable name as Serial No.
          S_313.add ("313");
          S_313.add ("");
          S_313.add ("2. scooter");
          S_313.add ("Name Bajaj");
          S_313.add ("each");
          S_313.add ("");
          S_313.add ("");
          S_313.add ("");


          ArrayList <String> S_314 = new ArrayList <String> ();
          S_314.add ("314");
          S_314.add ("602");
          S_314.add ("1. motor car");
          S_314.add ("Maruti 800 / others (name)");
          S_314.add ("each");
          S_314.add ("");
          S_314.add ("");
          S_314.add ("");



          ArrayList <String> S_315 = new ArrayList <String> (); // variable name as Serial No.
          S_315.add ("315");
          S_315.add ("");
          S_315.add ("2. jeep");
          S_315.add ("Marshall");
          S_315.add ("each");
          S_315.add ("");
          S_315.add ("");
          S_315.add ("");


          ArrayList <String> S_316 = new ArrayList <String> ();
          S_316.add ("316");
          S_316.add ("603");
          S_316.add ("Tires & Tubes");
          S_316.add ("Mention name");
          S_316.add ("each");
          S_316.add ("");
          S_316.add ("");
          S_316.add ("");



          ArrayList <String> S_317 = new ArrayList <String> (); // variable name as Serial No.
          S_317.add ("317");
          S_317.add ("610");
          S_317.add ("1. Stone Eye");
          S_317.add ("Mention name");
          S_317.add ("each");
          S_317.add ("");
          S_317.add ("");
          S_317.add ("");


          ArrayList <String> S_318 = new ArrayList <String> ();
          S_318.add ("318");
          S_318.add ("");
          S_318.add ("2. Hearing machine / prosthesis (handicapped device)");
          S_318.add ("Mention name");
          S_318.add ("each");
          S_318.add ("");
          S_318.add ("");
          S_318.add ("");



          ArrayList <String> S_319 = new ArrayList <String> (); // variable name as Serial No.
          S_319.add ("319");
          S_319.add ("620");
          S_319.add ("1. Wall Clock");
          S_319.add ("Ajanta / others");
          S_319.add ("each");
          S_319.add ("");
          S_319.add ("");
          S_319.add ("");


          ArrayList <String> S_320 = new ArrayList <String> ();
          S_320.add ("320");
          S_320.add ("");
          S_320.add ("2. Wristwatches");
          S_320.add ("HMT / Others");
          S_320.add ("each");
          S_320.add ("");
          S_320.add ("");
          S_320.add ("");



          ArrayList <String> S_321 = new ArrayList <String> (); // variable name as Serial No.
          S_321.add ("321");
          S_321.add ("622");
          S_321.add ("personal computer");
          S_321.add ("Mention name");
          S_321.add ("each");
          S_321.add ("");
          S_321.add ("");
          S_321.add ("");


          ArrayList <String> S_322 = new ArrayList <String> ();
          S_322.add ("322");
          S_322.add ("623");
          S_322.add ("Mobile Phone Set");
          S_322.add ("Nokia / others (name)");
          S_322.add ("each");
          S_322.add ("");
          S_322.add ("");
          S_322.add ("");



          ArrayList <String> S_323 = new ArrayList <String> (); // variable name as Serial No.
          S_323.add ("323");
          S_323.add ("630");
          S_323.add ("Cleaning equipment in bathrooms");
          S_323.add ("Name");
          S_323.add ("each");
          S_323.add ("");
          S_323.add ("");
          S_323.add ("");


          ArrayList <String> S_324 = new ArrayList <String> ();
          S_324.add ("324");
          S_324.add ("631");
          S_324.add ("1.plug");
          S_324.add ("enc / other");
          S_324.add ("each");
          S_324.add ("");
          S_324.add ("");
          S_324.add ("");



          ArrayList <String> S_325 = new ArrayList <String> (); // variable name as Serial No.
          S_325.add ("325");
          S_325.add ("");
          S_325.add ("2. electrical switch");
          S_325.add ("enc / other");
          S_325.add ("each");
          S_325.add ("");
          S_325.add ("");
          S_325.add ("");


          ArrayList <String> S_326 = new ArrayList <String> ();
          S_326.add ("326");
          S_326.add ("460");
          S_326.add ("3. electric bulb");
          S_326.add ("filips / others");
          S_326.add ("each");
          S_326.add ("");
          S_326.add ("");
          S_326.add ("");



          ArrayList <String> S_327 = new ArrayList <String> (); // variable name as Serial No.
          S_327.add ("327");
          S_327.add ("");
          S_327.add ("4. Tubelight");
          S_327.add ("Phillips / others");
          S_327.add ("each");
          S_327.add ("");
          S_327.add ("");
          S_327.add ("");


          ArrayList <String> S_328 = new ArrayList <String> ();
          S_328.add ("328");
          S_328.add ("");
          S_328.add ("1. MBBS");
          S_328.add ("");
          S_328.add ("per");
          S_328.add ("");
          S_328.add ("");
          S_328.add ("");



          ArrayList <String> S_329 = new ArrayList <String> (); // variable name as Serial No.
          S_329.add ("329");
          S_329.add ("");
          S_329.add ("2. Homoeopathic BHMS");
          S_329.add ("");
          S_329.add ("per");
          S_329.add ("");
          S_329.add ("");
          S_329.add ("");

          ArrayList <String> S_330 = new ArrayList <String> ();
          S_330.add ("330");
          S_330.add ("");
          S_330.add ("3. Ayurveda B.A.M.S.");
          S_330.add ("per");
          S_330.add ("per");
          S_330.add ("");
          S_330.add ("");
          S_330.add ("");



          ArrayList <String> S_331 = new ArrayList <String> (); // variable name as Serial No.
          S_331.add ("331");
          S_331.add ("");
          S_331.add ("X-ray fees");
          S_331.add ("per");
          S_331.add ("per");
          S_331.add ("");
          S_331.add ("");
          S_331.add ("");


          ArrayList <String> S_332 = new ArrayList <String> ();
          S_332.add ("332");
          S_332.add ("");
          S_332.add ("1. MBBS");
          S_332.add ("");
          S_332.add ("per");
          S_332.add ("");
          S_332.add ("");
          S_332.add ("");



          ArrayList <String> S_333 = new ArrayList <String> (); // variable name as Serial No.
          S_333.add ("333");
          S_333.add ("");
          S_333.add ("2. Homoeopathic BHMS");
          S_333.add ("");
          S_333.add ("per");

          S_333.add ("");
          S_333.add ("");
          S_333.add ("");


          ArrayList <String> S_334 = new ArrayList <String> ();
          S_334.add ("334");
          S_334.add ("602");
          S_334.add ("3. Ayurveda B.A.M.S.");
          S_334.add ("per");
          S_334.add ("per");
          S_334.add ("");
          S_334.add ("");
          S_334.add ("");



          ArrayList <String> S_335 = new ArrayList <String> (); // variable name as Serial No.
          S_335.add ("335");
          S_335.add ("");
          S_335.add ("X-ray fees");
          S_335.add ("per");
          S_335.add ("per");
          S_335.add ("");
          S_335.add ("");
          S_335.add ("");


          ArrayList <String> S_336 = new ArrayList <String> ();
          S_336.add ("336");
          S_336.add ("");
          S_336.add ("ECG");
          S_336.add ("Normal");
          S_336.add ("per");
          S_336.add ("");
          S_336.add ("");
          S_336.add ("");



          ArrayList <String> S_337 = new ArrayList <String> (); // variable name as Serial No.
          S_337.add ("337");
          S_337.add ("");
          S_337.add ("Blood Fees");
          S_337.add ("normal");
          S_337.add ("per");
          S_337.add ("");
          S_337.add ("");
          S_337.add ("");


          ArrayList <String> S_338 = new ArrayList <String> ();
          S_338.add ("338");
          S_338.add ("");
          S_338.add ("Aspirin");
          S_338.add ("");
          S_338.add ("per 10 tablets");
          S_338.add ("");
          S_338.add ("");
          S_338.add ("");



          ArrayList <String> S_339 = new ArrayList <String> (); // variable name as Serial No.
          S_339.add ("339");
          S_339.add ("");
          S_339.add ("Paracetamol  ");
          S_339.add (" ");
          S_339.add ("per 10 tablets");
          S_339.add ("");
          S_339.add ("");
          S_339.add ("");


          ArrayList <String> S_340 = new ArrayList <String> ();
          S_340.add ("340");
          S_340.add ("");
          S_340.add ("Antibiotics");
          S_340.add ("name");
          S_340.add ("per 10 tablets");
          S_340.add ("");
          S_340.add ("");
          S_340.add ("");

          ArrayList <String> S_341 = new ArrayList <String> (); // variable name as Serial No.
          S_341.add ("341");
          S_341.add ("");
          S_341.add ("Cough Syrup");
          S_341.add ("Benadryl 114 ml");
          S_341.add ("per syrup");
          S_341.add ("");
          S_341.add ("");
          S_341.add ("");


          ArrayList <String> S_342 = new ArrayList <String> ();
          S_342.add ("342");
          S_342.add ("");
          S_342.add ("Capsule");
          S_342.add ("amoxicillin 250 mg");
          S_342.add ("capsule");
          S_342.add ("");
          S_342.add ("");
          S_342.add ("");



          ArrayList <String> S_343 = new ArrayList <String> (); // variable name as Serial No.
          S_343.add ("343");
          S_343.add ("");
          S_343.add ("Maternity Fees");
          S_343.add ("Hospital/nursing home");
          S_343.add ("per");
          S_343.add ("");
          S_343.add ("");
          S_343.add ("");


          ArrayList <String> S_344 = new ArrayList <String> ();
          S_344.add ("344");
          S_344.add ("405");
          S_344.add ("Primary level");
          S_344.add ("");
          S_344.add ("monthly");
          S_344.add ("");
          S_344.add ("");
          S_344.add ("");



          ArrayList <String> S_345 = new ArrayList <String> (); // variable name as Serial No.
          S_345.add ("345");
          S_345.add ("");
          S_345.add ("JU level");
          S_345.add ("");
          S_345.add ("monthly");
          S_345.add ("");
          S_345.add ("");
          S_345.add ("");


          ArrayList <String> S_346 = new ArrayList <String> ();
          S_346.add ("346");
          S_346.add ("");
          S_346.add ("Intermediate Level");
          S_346.add ("High school and inter");
          S_346.add ("monthly");
          S_346.add ("");
          S_346.add ("");
          S_346.add ("");



          ArrayList <String> S_347 = new ArrayList <String> (); // variable name as Serial No.
          S_347.add ("347");
          S_347.add ("");
          S_347.add ("Higher Education");
          S_347.add ("");
          S_347.add ("monthly");
          S_347.add ("");
          S_347.add ("");
          S_347.add ("");


          ArrayList <String> S_348 = new ArrayList <String> ();
          S_348.add ("348");
          S_348.add ("400");
          S_348.add ("Primary level");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");



          ArrayList <String> S_349 = new ArrayList <String> (); // variable name as Serial No.
          S_349.add ("349");
          S_349.add ("");
          S_349.add ("JU level");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");


          ArrayList <String> S_350 = new ArrayList <String> ();
          S_350.add ("350");
          S_350.add ("");
          S_350.add ("Intermediate Level");
          S_350.add ("High School and Inter");
          S_350.add ("");
          S_350.add ("");
          S_350.add ("");
          S_350.add ("");



          ArrayList <String> S_351 = new ArrayList <String> (); // variable name as Serial No.
          S_351.add ("351");
          S_351.add ("");
          S_351.add ("Higher Education");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");


          ArrayList <String> S_352 = new ArrayList <String> ();
          S_352.add ("352");
          S_352.add ("404");
          S_352.add ("Copy");
          S_352.add ("64 pages");
          S_352.add ("per dozen");
          S_352.add ("");
          S_352.add ("");
          S_352.add ("");



          ArrayList <String> S_353 = new ArrayList <String> (); // variable name as Serial No.
          S_353.add ("353");
          S_353.add ("");
          S_353.add ("Register");
          S_353.add ("2 seat");
          S_353.add ("Per dozen");
          S_353.add ("");
          S_353.add ("");
          S_353.add ("");


          ArrayList <String> S_354 = new ArrayList <String> ();
          S_354.add ("354");
          S_354.add ("");
          S_354.add ("Ball Pen");
          S_354.add ("Cello/Reynolds");
          S_354.add ("Per ten");
          S_354.add ("");
          S_354.add ("");
          S_354.add ("");



          ArrayList <String> S_355 = new ArrayList <String> (); // variable name as Serial No.
          S_355.add ("355");
          S_355.add ("");
          S_355.add ("Pencil");
          S_355.add ("");
          S_355.add ("Per ten");
          S_355.add ("");
          S_355.add ("");
          S_355.add ("");


          ArrayList <String> S_356 = new ArrayList <String> ();
          S_356.add ("356");
          S_356.add ("");
          S_356.add ("4 School Dress");
          S_356.add ("Medium");
          S_356.add ("Per");
          S_356.add ("");
          S_356.add ("");
          S_356.add ("");



          ArrayList <String> S_357 = new ArrayList <String> (); // variable name as Serial No.
          S_357.add ("357");
          S_357.add ("1");
          S_357.add ("Brick");
          S_357.add ("Per 1000");
          S_357.add ("");
          S_357.add ("");
          S_357.add ("");


          ArrayList <String> S_358 = new ArrayList <String> ();
          S_358.add ("358");
          S_358.add ("2");
          S_358.add ("Rebar (Sariya)");
          S_358.add ("Per quintal");
          S_358.add ("");
          S_358.add ("");
          S_358.add ("");



          ArrayList <String> S_359 = new ArrayList <String> (); // variable name as Serial No.
          S_359.add ("359");
          S_359.add ("3");
          S_359.add ("Cement");
          S_359.add ("Per 50 kg");
          S_359.add ("");
          S_359.add ("");
          S_359.add ("");
          S_359.add ("");


          ArrayList <String> S_360 = new ArrayList <String> ();
          S_360.add ("360");
          S_360.add ("4");
          S_360.add ("Sand");
          S_360.add ("Desi White");
          S_360.add ("Per 100 square feet");
          S_360.add ("");
          S_360.add ("");
          S_360.add ("");

          ArrayList <String> S_361 = new ArrayList <String> ();
          S_361.add ("361");
          S_361.add ("5");
          S_361.add ("Maurang");
          S_361.add ("Red");
          S_361.add ("Per 100 square feet");
          S_361.add ("");
          S_361.add ("");
          S_361.add ("");


          ArrayList <String> S_362 = new ArrayList <String> ();
          S_362.add ("362");
          S_362.add ("6");
          S_362.add ("Paint");
          S_362.add ("Name");
                  S_362.add ("Per Kilogramme");
          S_362.add ("");
          S_362.add ("");
          S_362.add ("");



          Electronics_Utensils_others.add(S_300);
          Electronics_Utensils_others.add(S_301);
          Electronics_Utensils_others.add(S_302);
          Electronics_Utensils_others.add(S_303);
          Electronics_Utensils_others.add(S_304);
          Electronics_Utensils_others.add(S_305);
          Electronics_Utensils_others.add(S_306);
          Electronics_Utensils_others.add(S_307);
          Electronics_Utensils_others.add(S_308);
          Electronics_Utensils_others.add(S_309);
          Electronics_Utensils_others.add(S_310);



          List<ArrayList<String>> General_traffic_resource= new ArrayList<ArrayList<String>>();
          General_traffic_resource.add(S_311);
          General_traffic_resource.add(S_312);
          General_traffic_resource.add(S_313);
          General_traffic_resource.add(S_314);
          General_traffic_resource.add(S_315);
          General_traffic_resource.add(S_316);
          General_traffic_resource.add(S_317);
          General_traffic_resource.add(S_318);
          General_traffic_resource.add(S_319);
          General_traffic_resource.add(S_320);
          General_traffic_resource.add(S_321);
          General_traffic_resource.add(S_322);
          General_traffic_resource.add(S_323);
          General_traffic_resource.add(S_324);
          General_traffic_resource.add(S_325);
          General_traffic_resource.add(S_326);
          General_traffic_resource.add(S_327);

          List<ArrayList<String>> Medical_one_Doctor_advice_fees_at_the_clinic= new ArrayList<ArrayList<String>>();
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_328);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_329);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_330);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_331);



          List<ArrayList<String>> house_going_fee= new ArrayList<ArrayList<String>>();
          house_going_fee.add(S_332);
          house_going_fee.add(S_333);
          house_going_fee.add(S_334);
          house_going_fee.add(S_335);
          house_going_fee.add(S_336);
          house_going_fee.add(S_337);
          house_going_fee.add(S_338);
          house_going_fee.add(S_339);
          house_going_fee.add(S_340);
          house_going_fee.add(S_341);
          house_going_fee.add(S_342);
          house_going_fee.add(S_343);



          List<ArrayList<String>>Educational_expense= new ArrayList<ArrayList<String>>();
          Educational_expense.add(S_344);
          Educational_expense.add(S_245);
          Educational_expense.add(S_346);
          Educational_expense.add(S_347);

          List<ArrayList<String>> Copy_set= new ArrayList<ArrayList<String>>();
          Copy_set.add(S_348);
          Copy_set.add(S_349);
          Copy_set.add(S_350);
          Copy_set.add(S_351);

          List<ArrayList<String>> Stationary= new ArrayList<ArrayList<String>>();
          Stationary.add(S_352);
          Stationary.add(S_353);
          Stationary.add(S_354);
          Stationary.add(S_355);
          Stationary.add(S_356);


          List<ArrayList<String>> accommodation= new ArrayList<ArrayList<String>>();
          accommodation.add(S_357);
          accommodation.add(S_358);
          accommodation.add(S_359);
          accommodation.add(S_360);
          accommodation.add(S_361);
          accommodation.add(S_362);


          switch(i) {

               case 0: return Foods;
               case 1: return Substance;
               case 2: return Fuel;
               case 3: return Clothing;
               case 4: return Shoes;
               case 5: return Entertainment_And_Other;
               case 6:return Other_Beauty_Product;
               case 7: return Utensils;
               case 8: return Services;
               case 9: return Transportation_Services;
               case 10: return Rent_And_Loan;
               case 11: return Other_home_services;
               case 12: return Jewelry;
               case 13: return Electronics_Utensils_others;
               case 14:return General_traffic_resource;
               case 15: return Medical_one_Doctor_advice_fees_at_the_clinic;
               case 16: return house_going_fee;
               case 17: return Educational_expense;
               case 18: return Copy_set;
               case 19: return Stationary ;
               case 20: return accommodation;
               default: List<ArrayList<String>> empt = new ArrayList<ArrayList<String>>(0);
                    return empt;
          }

     }*/

     List<ArrayList<String>> rural_sector(int i)
     {

          ArrayList<String> S_1 = new ArrayList<String>();
          S_1.add ("1");
          S_1.add ("101");
          S_1.add ("rice-PDS");
          S_1.add ("Medium");
          S_1.add ("grams per kg");
          S_1.add ("");
          S_1.add ("");
          S_1.add ("");

          ArrayList<String> S_2 = new ArrayList<String> ();
          S_2.add ("2");
          S_2.add ("102");
          S_2.add ("rice-other sources");
          S_2.add ("Medium");
          S_2.add ("grams per kg");
          S_2.add ("");
          S_2.add ("");
          S_2.add ("");

          ArrayList<String> S_3 = new ArrayList<String> ();
          S_3.add ("3");
          S_3.add ("103");
          S_3.add ("Chirwa-sawdust");
          S_3.add ("Medium");
          S_3.add ("grams per kg");
          S_3.add ("");
          S_3.add ("");
          S_3.add ("");

          ArrayList<String> S_4 = new ArrayList<String> ();
          S_4.add ("4");
          S_4.add ("104");
          S_4.add ("lava");
          S_4.add ("Medium");
          S_4.add ("grams per kg");
          S_4.add ("");
          S_4.add ("");
          S_4.add ("");

          ArrayList <String> S_5 = new ArrayList <String> ();
          S_5.add ("5");
          S_5.add ("106");
          S_5.add ("else (give name)");
          S_5.add ("Medium");
          S_5.add ("grams per kg");
          S_5.add ("");
          S_5.add ("");
          S_5.add ("");

          ArrayList <String> S_6 = new ArrayList <String> ();
          S_6.add ("6");
          S_6.add ("107");
          S_6.add ("1- wheat-pds");
          S_6.add ("white");
          S_6.add ("grams per kg");
          S_6.add ("");
          S_6.add ("");
          S_6.add ("");

          ArrayList <String> S_7 = new ArrayList <String> ();
          S_7.add ("7");
          S_7.add ("108");
          S_7.add ("1- wheat-other sources");
          S_7.add ("white");
          S_7.add ("grams per kg");
          S_7.add ("");
          S_7.add ("");
          S_7.add ("");

          ArrayList <String> S_8 = new ArrayList <String> ();
          S_8.add ("8");
          S_8.add ("108");
          S_8.add ("1- wheat-flour");
          S_8.add ("ordinary");
          S_8.add ("grams per kg");
          S_8.add ("");
          S_8.add ("");
          S_8.add ("");

          ArrayList <String> S_9 = new ArrayList <String> ();
          S_9.add ("9");
          S_9.add ("110");
          S_9.add ("maida");
          S_9.add ("ordinary");
          S_9.add ("grams per kg");
          S_9.add ("");
          S_9.add ("");
          S_9.add ("");

          ArrayList <String> S_10 = new ArrayList <String> ();
          S_10.add ("10");
          S_10.add ("111");
          S_10.add ("suji, rava");
          S_10.add ("ordinary");
          S_10.add ("grams per kg");
          S_10.add ("");
          S_10.add ("");
          S_10.add ("");

          ArrayList <String> S_11 = new ArrayList <String> ();
          S_11.add ("11");
          S_11.add ("112");
          S_11.add ("noodles / sevai");
          S_11.add ("ordinary");
          S_11.add ("grams per kg");
          S_11.add ("");
          S_11.add ("");
          S_11.add ("");

          ArrayList <String> S_12 = new ArrayList <String> ();
          S_12.add ("12");
          S_12.add ("113");
          S_12.add ("bread");
          S_12.add ("ordinary (local)");
          S_12.add ("grams per kg");
          S_12.add ("");
          S_12.add ("");
          S_12.add ("");

          ArrayList <String> S_13 = new ArrayList <String> ();
          S_13.add ("13");
          S_13.add ("114");
          S_13.add ("else (give name)");
          S_13.add ("ordinary");
          S_13.add ("grams per kg");
          S_13.add ("");
          S_13.add ("");
          S_13.add ("");

          ArrayList <String> S_14 = new ArrayList <String> ();
          S_14.add ("14");
          S_14.add ("115");
          S_14.add ("juwar");
          S_14.add ("whip white");
          S_14.add ("grams per kg");
          S_14.add ("");
          S_14.add ("");
          S_14.add ("");

          ArrayList <String> S_15 = new ArrayList <String> ();
          S_15.add ("15");
          S_15.add ("116");
          S_15.add ("bajra");
          S_15.add ("bit medium");
          S_15.add ("grams per kg");
          S_15.add ("");
          S_15.add ("");
          S_15.add ("");

          ArrayList <String> S_16 = new ArrayList <String> ();
          S_16.add ("16");
          S_16.add ("117");
          S_16.add ("Makka");
          S_16.add ("yellow / white (medium)");
          S_16.add ("grams per kg");
          S_16.add ("");
          S_16.add ("");
          S_16.add ("");

          ArrayList <String> S_17 = new ArrayList <String> ();
          S_17.add ("17");
          S_17.add ("118");
          S_17.add ("jo");
          S_17.add ("Dara");
          S_17.add ("grams per kg");
          S_17.add ("");
          S_17.add ("");
          S_17.add ("");

          ArrayList <String> S_18 = new ArrayList <String> ();
          S_18.add ("18");
          S_18.add ("140");
          S_18.add ("arhar dal");
          S_18.add ("ordinary");
          S_18.add ("grams per kg");
          S_18.add ("");
          S_18.add ("");
          S_18.add ("");

          ArrayList <String> S_19 = new ArrayList <String> ();
          S_19.add ("19");
          S_19.add ("141");
          S_19.add ("Chana dal");
          S_19.add ("ordinary");
          S_19.add ("grams per kg");
          S_19.add ("");
          S_19.add ("");
          S_19.add ("");

          ArrayList <String> S_20 = new ArrayList <String> ();
          S_20.add ("20");
          S_20.add ("142");
          S_20.add ("1- Chana saabut-Desi");
          S_20.add ("ordinary");
          S_20.add ("grams per kg");
          S_20.add ("");
          S_20.add ("");
          S_20.add ("");

          ArrayList <String> S_21 = new ArrayList <String> ();
          S_21.add ("21");
          S_21.add ("142");
          S_21.add ("2- Kabuli");
          S_21.add ("ordinary");
          S_21.add ("grams per kg");
          S_21.add ("");
          S_21.add ("");
          S_21.add ("");

          ArrayList <String> S_22 = new ArrayList <String> ();
          S_22.add ("22");
          S_22.add ("143");
          S_22.add ("moong dal");
          S_22.add ("medium peeled");
          S_22.add ("grams per kg");
          S_22.add ("");
          S_22.add ("");
          S_22.add ("");

          ArrayList <String> S_23 = new ArrayList <String> ();
          S_23.add ("23");
          S_23.add ("144");
          S_23.add ("Masoor Dal");
          S_23.add ("desi / medium / stool");
          S_23.add ("grams per kg");
          S_23.add ("");
          S_23.add ("");
          S_23.add ("");

          ArrayList <String> S_24 = new ArrayList <String> ();
          S_24.add ("24");
          S_24.add ("145");
          S_24.add ("urad dal");
          S_24.add ("Medium unshielded");
          S_24.add ("grams per kg");
          S_24.add ("");
          S_24.add ("");
          S_24.add ("");

          ArrayList <String> S_25 = new ArrayList <String> ();
          S_25.add ("25");
          S_25.add ("146");
          S_25.add ("1- Matar daal (without peel)");
          S_25.add ("Medium Size");
          S_25.add ("grams per kg");
          S_25.add ("");
          S_25.add ("");
          S_25.add ("");

          ArrayList <String> S_26 = new ArrayList <String> ();
          S_26.add ("26");
          S_26.add ("146");
          S_26.add ("2- Matar saabut");
          S_26.add ("medium variety");
          S_26.add ("grams per kg");
          S_26.add ("");
          S_26.add ("");
          S_26.add ("");

          ArrayList <String> S_27 = new ArrayList <String> ();
          S_27.add ("27");
          S_27.add ("901");
          S_27.add ("Soybean Large");
          S_27.add ("medium variety");
          S_27.add ("grams per kg");
          S_27.add ("");
          S_27.add ("");
          S_27.add ("");

          ArrayList <String> S_28 = new ArrayList <String> ();
          S_28.add ("28");
          S_28.add ("147");
          S_28.add ("Khesari");
          S_28.add ("medium variety");
          S_28.add ("grams per kg");
          S_28.add ("");
          S_28.add ("");
          S_28.add ("");

          ArrayList <String> S_29 = new ArrayList <String> ();
          S_29.add ("29");
          S_29.add ("148");
          S_29.add ("else (give name)");
          S_29.add ("medium variety");
          S_29.add ("grams per kg");
          S_29.add ("");
          S_29.add ("");
          S_29.add ("");

          ArrayList <String> S_30 = new ArrayList <String> ();
          S_30.add ("30");
          S_30.add ("150");
          S_30.add ("Chana utpaad");
          S_30.add ("medium variety");
          S_30.add ("grams per kg");
          S_30.add ("");
          S_30.add ("");
          S_30.add ("");

          ArrayList <String> S_31 = new ArrayList <String> ();
          S_31.add ("31");
          S_31.add ("151");
          S_31.add ("Besan");
          S_31.add ("gram lentils");
          S_31.add ("grams per kg");
          S_31.add ("");
          S_31.add ("");
          S_31.add ("");

          ArrayList <String> S_32 = new ArrayList <String> ();
          S_32.add ("32");
          S_32.add ("151");
          S_32.add ("else (give name)");
          S_32.add ("");
          S_32.add ("grams per kg");
          S_32.add ("");
          S_32.add ("");
          S_32.add ("");

          ArrayList <String> S_33 = new ArrayList <String> ();
          S_33.add ("33");
          S_33.add ("160");
          S_33.add ("milk liquid");
          S_33.add ("of buffalo");
          S_33.add ("per liter");
          S_33.add ("");
          S_33.add ("");
          S_33.add ("");

          ArrayList <String> S_34 = new ArrayList <String> ();
          S_34.add ("34");
          S_34.add ("161");
          S_34.add ("baby food");
          S_34.add ("Lectrogen / Amul / others");
          S_34.add ("500 gram box");
          S_34.add ("");
          S_34.add ("");
          S_34.add ("");

          ArrayList <String> S_35 = new ArrayList <String> ();
          S_35.add ("35");
          S_35.add ("162");
          S_35.add ("milk powder / condensed");
          S_35.add ("Variety Jai");
          S_35.add ("500 gram box");
          S_35.add ("");
          S_35.add ("");
          S_35.add ("");

          ArrayList <String> S_36 = new ArrayList <String> ();
          S_36.add ("36");
          S_36.add ("163");
          S_36.add ("yogurt");
          S_36.add ("frozen");
          S_36.add ("grams per kg");
          S_36.add ("");
          S_36.add ("");
          S_36.add ("");

          ArrayList <String> S_37 = new ArrayList <String> ();
          S_37.add ("37");
          S_37.add ("164");
          S_37.add ("Ghee");
          S_37.add ("Ghee Desi");
          S_37.add ("grams per kg");
          S_37.add ("");
          S_37.add ("");
          S_37.add ("");

          ArrayList <String> S_38 = new ArrayList <String> ();
          S_38.add ("38");
          S_38.add ("165");
          S_38.add ("butter");
          S_38.add ("Pollen / Other");
          S_38.add ("Pack of 50 grams");
          S_38.add ("");
          S_38.add ("");
          S_38.add ("");

          ArrayList <String> S_39 = new ArrayList <String> ();
          S_39.add ("39");
          S_39.add ("166");
          S_39.add ("ice cream");
          S_39.add ("Medium");
          S_39.add ("50ml");
          S_39.add ("");
          S_39.add ("");
          S_39.add ("");

          ArrayList <String> S_40 = new ArrayList <String> ();
          S_40.add ("40");
          S_40.add ("167");
          S_40.add ("else (give name)");
          S_40.add ("Medium");
          S_40.add ("");
          S_40.add ("");
          S_40.add ("");
          S_40.add ("");

          ArrayList <String> S_41 = new ArrayList <String> ();
          S_41.add ("41");
          S_41.add ("171");
          S_41.add ("Sugar-PDS");
          S_41.add ("Medium");
          S_41.add ("grams per kg");
          S_41.add ("");
          S_41.add ("");
          S_41.add ("");

          ArrayList <String> S_42 = new ArrayList <String> ();
          S_42.add ("42");
          S_42.add ("172");
          S_42.add ("Sugar");
          S_42.add ("Medium");
          S_42.add ("grams per kg");
          S_42.add ("");
          S_42.add ("");
          S_42.add ("");

          ArrayList <String> S_43 = new ArrayList <String> ();
          S_43.add ("43");
          S_43.add ("173");
          S_43.add ("jaggery");
          S_43.add ("laddu / innings");
          S_43.add ("grams per kg");
          S_43.add ("");
          S_43.add ("");
          S_43.add ("");

          ArrayList <String> S_44 = new ArrayList <String> ();
          S_44.add ("44");
          S_44.add ("174");
          S_44.add ("Candy (Mishri)");
          S_44.add ("");
          S_44.add ("100 grams");
          S_44.add ("");
          S_44.add ("");
          S_44.add ("");

          ArrayList <String> S_45 = new ArrayList <String> ();
          S_45.add ("45");
          S_45.add ("175");
          S_45.add ("honey");
          S_45.add ("");
          S_45.add ("grams per kg");
          S_45.add ("");
          S_45.add ("");
          S_45.add ("");

          ArrayList <String> S_46 = new ArrayList <String> ();
          S_46.add ("46");
          S_46.add ("170");
          S_46.add ("1- Salt saabut");
          S_46.add ("");
          S_46.add ("grams per kg");
          S_46.add ("");
          S_46.add ("");
          S_46.add ("");

          ArrayList <String> S_47 = new ArrayList <String> ();
          S_47.add ("47");
          S_47.add ("170");
          S_47.add ("2- salt pisa");
          S_47.add ("Tata");
          S_47.add ("grams per kg");
          S_47.add ("");
          S_47.add ("");
          S_47.add ("");

          ArrayList <String> S_48 = new ArrayList <String> ();
          S_48.add ("48");
          S_48.add ("180");
          S_48.add ("Vegetable Ghee");
          S_48.add ("branded");
          S_48.add ("per liter");
          S_48.add ("");
          S_48.add ("");
          S_48.add ("");

          ArrayList <String> S_49 = new ArrayList <String> ();
          S_49.add ("49");
          S_49.add ("181");
          S_49.add ("mustard oil");
          S_49.add ("open");
          S_49.add ("per liter");
          S_49.add ("");
          S_49.add ("");
          S_49.add ("");

          ArrayList <String> S_50 = new ArrayList <String> ();
          S_50.add ("50");
          S_50.add ("182");
          S_50.add ("Peanut oil");
          S_50.add ("open");
          S_50.add ("per liter");
          S_50.add ("");
          S_50.add ("");
          S_50.add ("");

          ArrayList <String> S_51 = new ArrayList <String> ();
          S_51.add ("51");
          S_51.add ("183");
          S_51.add ("Coconut oil");
          S_51.add ("canned");
          S_51.add ("100 grams");
          S_51.add ("");
          S_51.add ("");
          S_51.add ("");

          ArrayList <String> S_52 = new ArrayList <String> ();
          S_52.add ("52");
          S_52.add ("185");
          S_52.add ("Other (name) palm oil");
          S_52.add ("Variety jay");
          S_52.add ("per liter");
          S_52.add ("");
          S_52.add ("");
          S_52.add ("");

          ArrayList <String> S_53 = new ArrayList <String> ();
          S_53.add ("53");
          S_53.add ("190");
          S_53.add ("egg");
          S_53.add ("Desi / Farm");
          S_53.add ("each");
          S_53.add ("");
          S_53.add ("");
          S_53.add ("");

          ArrayList <String> S_54 = new ArrayList <String> ();
          S_54.add ("54");
          S_54.add ("191");
          S_54.add ("1- fish rohu");
          S_54.add ("Medium");
          S_54.add ("grams per kg");
          S_54.add ("");
          S_54.add ("");
          S_54.add ("");

          ArrayList <String> S_55 = new ArrayList <String> ();
          S_55.add ("55");
          S_55.add ("191");
          S_55.add ("2- fish readin");
          S_55.add ("Medium");
          S_55.add ("grams per kg");
          S_55.add ("");
          S_55.add ("");
          S_55.add ("");

          ArrayList <String> S_56 = new ArrayList <String> ();
          S_56.add ("56");
          S_56.add ("192");
          S_56.add ("meat-goat");
          S_56.add ("including bone");
          S_56.add ("grams per kg");
          S_56.add ("");
          S_56.add ("");
          S_56.add ("");

          ArrayList <String> S_57 = new ArrayList <String> ();
          S_57.add ("57");
          S_57.add ("193");
          S_57.add ("meat-buffalo");
          S_57.add ("including bone");
          S_57.add ("grams per kg");
          S_57.add ("");
          S_57.add ("");
          S_57.add ("");

          ArrayList <String> S_58 = new ArrayList <String> ();
          S_58.add ("58");
          S_58.add ("194");
          S_58.add ("of meat-pig");
          S_58.add ("");
          S_58.add ("grams per kg");
          S_58.add ("");
          S_58.add ("");
          S_58.add ("");

          ArrayList <String> S_59 = new ArrayList <String> ();
          S_59.add ("59");
          S_59.add ("195");
          S_59.add ("chicken (of chicken)");
          S_59.add ("");
          S_59.add ("grams per kg");
          S_59.add ("");
          S_59.add ("");
          S_59.add ("");

          ArrayList <String> S_60 = new ArrayList <String> ();
          S_60.add ("60");
          S_60.add ("196");
          S_60.add ("else (give name)");
          S_60.add ("");
          S_60.add ("grams per kg");
          S_60.add ("");
          S_60.add ("");
          S_60.add ("");

          ArrayList <String> S_61 = new ArrayList <String> ();
          S_61.add ("61");
          S_61.add ("200");
          S_61.add ("potato");
          S_61.add ("Desi / hill");
          S_61.add ("grams per kg");
          S_61.add ("");
          S_61.add ("");
          S_61.add ("");

          ArrayList <String> S_62 = new ArrayList <String> ();
          S_62.add ("62");
          S_62.add ("201");
          S_62.add ("onion");
          S_62.add ("dry");
          S_62.add ("grams per kg");
          S_62.add ("");
          S_62.add ("");
          S_62.add ("");

          ArrayList <String> S_63 = new ArrayList <String> ();
          S_63.add ("63");
          S_63.add ("204");
          S_63.add ("radish");
          S_63.add ("ordinary");
          S_63.add ("grams per kg");
          S_63.add ("");
          S_63.add ("");
          S_63.add ("");

          ArrayList <String> S_64 = new ArrayList <String> ();
          S_64.add ("64");
          S_64.add ("205");
          S_64.add ("carrot");
          S_64.add ("red / yellow");
          S_64.add ("grams per kg");
          S_64.add ("");
          S_64.add ("");
          S_64.add ("");

          ArrayList <String> S_65 = new ArrayList <String> ();
          S_65.add ("65");
          S_65.add ("902");
          S_65.add ("turnip");
          S_65.add ("");
          S_65.add ("grams per kg");
          S_65.add ("");
          S_65.add ("");
          S_65.add ("");

          ArrayList <String> S_66 = new ArrayList <String> ();
          S_66.add ("66");
          S_66.add ("903");
          S_66.add ("Beetroot");
          S_66.add ("");
          S_66.add ("grams per kg");
          S_66.add ("");
          S_66.add ("");
          S_66.add ("");

          ArrayList <String> S_67 = new ArrayList <String> ();
          S_67.add ("67");
          S_67.add ("904");
          S_67.add ("sweet potato");
          S_67.add ("");
          S_67.add ("grams per kg");
          S_67.add ("");
          S_67.add ("");
          S_67.add ("");

          ArrayList <String> S_68 = new ArrayList <String> ();
          S_68.add ("68");
          S_68.add ("905");
          S_68.add ("Arabic");
          S_68.add ("");
          S_68.add ("grams per kg");
          S_68.add ("");
          S_68.add ("");
          S_68.add ("");

          ArrayList <String> S_69 = new ArrayList <String> ();
          S_69.add ("69");
          S_69.add ("213");
          S_69.add ("Kaddu / Kashi fruit");
          S_69.add ("green");
          S_69.add ("grams per kg");
          S_69.add ("");
          S_69.add ("");
          S_69.add ("");

          ArrayList <String> S_70 = new ArrayList <String> ();
          S_70.add ("70");
          S_70.add ("213");
          S_70.add ("Loki");
          S_70.add ("");
          S_70.add ("grams per kg");
          S_70.add ("");
          S_70.add ("");
          S_70.add ("");

          ArrayList <String> S_71 = new ArrayList <String> ();
          S_71.add ("71");
          S_71.add ("906");
          S_71.add ("karela");
          S_71.add ("");
          S_71.add ("grams per kg");
          S_71.add ("");
          S_71.add ("");
          S_71.add ("");

          ArrayList <String> S_72 = new ArrayList <String> ();
          S_72.add ("72");
          S_72.add ("907");
          S_72.add ("Cucumber / Cucumber");
          S_72.add ("name it");
          S_72.add ("each piece");
          S_72.add ("");
          S_72.add ("");
          S_72.add ("");

          ArrayList <String> S_73 = new ArrayList <String> ();
          S_73.add ("73");
          S_73.add ("210");
          S_73.add ("Parval / Table");
          S_73.add ("");
          S_73.add ("grams per kg");
          S_73.add ("");
          S_73.add ("");
          S_73.add ("");

          ArrayList <String> S_74 = new ArrayList <String> ();
          S_74.add ("74");
          S_74.add ("908");
          S_74.add ("Zhiga / Taroi / Ninevah");
          S_74.add ("");
          S_74.add ("grams per kg");
          S_74.add ("");
          S_74.add ("");
          S_74.add ("");

          ArrayList <String> S_75 = new ArrayList <String> ();
          S_75.add ("75");
          S_75.add ("909");
          S_75.add ("chichida");
          S_75.add ("");
          S_75.add ("grams per kg");
          S_75.add ("");
          S_75.add ("");
          S_75.add ("");

          ArrayList <String> S_76 = new ArrayList <String> ();
          S_76.add ("76");
          S_76.add ("910");
          S_76.add ("papaya green");
          S_76.add ("");
          S_76.add ("grams per kg");
          S_76.add ("");
          S_76.add ("");
          S_76.add ("");

          ArrayList <String> S_77 = new ArrayList <String> ();
          S_77.add ("77");
          S_77.add ("211");
          S_77.add ("Cauliflower");
          S_77.add ("");
          S_77.add ("grams per kg");
          S_77.add ("");
          S_77.add ("");
          S_77.add ("");

          ArrayList <String> S_78 = new ArrayList <String> ();
          S_78.add ("78");
          S_78.add ("212");
          S_78.add ("Cabbage off");
          S_78.add ("");
          S_78.add ("grams per kg");
          S_78.add ("");
          S_78.add ("");
          S_78.add ("");

          ArrayList <String> S_79 = new ArrayList <String> ();
          S_79.add ("79");
          S_79.add ("203");
          S_79.add ("brinjal");
          S_79.add ("long / round");
          S_79.add ("grams per kg");
          S_79.add ("");
          S_79.add ("");
          S_79.add ("");

          ArrayList <String> S_80 = new ArrayList <String> ();
          S_80.add ("80");
          S_80.add ("208");
          S_80.add ("LadyFinger");
          S_80.add ("");
          S_80.add ("grams per kg");
          S_80.add ("");
          S_80.add ("");
          S_80.add ("");

          ArrayList <String> S_81 = new ArrayList <String> ();
          S_81.add ("81");
          S_81.add ("206");
          S_81.add ("Spinach / Rye / Fenugreek");
          S_81.add ("");
          S_81.add ("grams per kg");
          S_81.add ("");
          S_81.add ("");
          S_81.add ("");

          ArrayList <String> S_82 = new ArrayList <String> ();
          S_82.add ("82");
          S_82.add ("217");
          S_82.add ("Other (name) beans");
          S_82.add ("");
          S_82.add ("grams per kg");
          S_82.add ("");
          S_82.add ("");
          S_82.add ("");

          ArrayList <String> S_83 = new ArrayList <String> ();
          S_83.add ("83");
          S_83.add ("202");
          S_83.add ("Tomato");
          S_83.add ("cook");
          S_83.add ("grams per kg");
          S_83.add ("");
          S_83.add ("");
          S_83.add ("");

          ArrayList <String> S_84 = new ArrayList <String> ();
          S_84.add ("84");
          S_84.add ("214");
          S_84.add ("Pea");
          S_84.add ("green");
          S_84.add ("grams per kg");
          S_84.add ("");
          S_84.add ("");
          S_84.add ("");

          ArrayList <String> S_85 = new ArrayList <String> ();
          S_85.add ("85");
          S_85.add ("207");
          S_85.add ("chili (green)");
          S_85.add ("");
          S_85.add ("grams per kg");
          S_85.add ("");
          S_85.add ("");
          S_85.add ("");

          ArrayList <String> S_86 = new ArrayList <String> ();
          S_86.add ("86");
          S_86.add ("911");
          S_86.add ("Shimla Mirch");
          S_86.add ("green");
          S_86.add ("grams per kg");
          S_86.add ("");
          S_86.add ("");
          S_86.add ("");

          ArrayList <String> S_87 = new ArrayList <String> ();
          S_87.add ("87");
          S_87.add ("912");
          S_87.add ("Banana Raw");
          S_87.add ("");
          S_87.add ("grams per kg");
          S_87.add ("");
          S_87.add ("");
          S_87.add ("");

          ArrayList <String> S_88 = new ArrayList <String> ();
          S_88.add ("88");
          S_88.add ("913");
          S_88.add ("jackfruit raw");
          S_88.add ("");
          S_88.add ("grams per kg");
          S_88.add ("");
          S_88.add ("");
          S_88.add ("");

          ArrayList <String> S_89 = new ArrayList <String> ();
          S_89.add ("89");
          S_89.add ("216");
          S_89.add ("Lemon");
          S_89.add ("yellow");
          S_89.add ("each");
          S_89.add ("");
          S_89.add ("");
          S_89.add ("");

          ArrayList <String> S_90 = new ArrayList <String> ();
          S_90.add ("90");
          S_90.add ("251");
          S_90.add ("garlic");
          S_90.add ("");
          S_90.add ("grams per kg");
          S_90.add ("");
          S_90.add ("");
          S_90.add ("");

          ArrayList <String> S_91 = new ArrayList <String> ();
          S_91.add ("91");
          S_91.add ("250");
          S_91.add ("Ginger");
          S_91.add ("");
          S_91.add ("grams per kg");
          S_91.add ("");
          S_91.add ("");
          S_91.add ("");

          ArrayList <String> S_92 = new ArrayList <String> ();
          S_92.add ("92");
          S_92.add ("914");
          S_92.add ("Other (give name)");
          S_92.add ("");
          S_92.add ("grams per kg");
          S_92.add ("");
          S_92.add ("");
          S_92.add ("");

          ArrayList <String> S_93 = new ArrayList <String> ();
          S_93.add ("93");
          S_93.add ("220");
          S_93.add ("Banana Cook");
          S_93.add ("");
          S_93.add ("per dozen");
          S_93.add ("");
          S_93.add ("");
          S_93.add ("");

          ArrayList <String> S_94 = new ArrayList <String> ();
          S_94.add ("94");
          S_94.add ("221");
          S_94.add ("Jackfruit Cook");
          S_94.add ("");
          S_94.add ("grams per kg");
          S_94.add ("");
          S_94.add ("");
          S_94.add ("");

          ArrayList <String> S_95 = new ArrayList <String> ();
          S_95.add ("95");
          S_95.add ("222");
          S_95.add ("Watermelon");
          S_95.add ("Medium");
          S_95.add ("grams per kg");
          S_95.add ("");
          S_95.add ("");
          S_95.add ("");

          ArrayList <String> S_96 = new ArrayList <String> ();
          S_96.add ("96");
          S_96.add ("223");
          S_96.add ("Pineapple");
          S_96.add ("Medium");
          S_96.add ("grams per kg");
          S_96.add ("");
          S_96.add ("");
          S_96.add ("");

          ArrayList <String> S_97 = new ArrayList <String> ();
          S_97.add ("97");
          S_97.add ("224");
          S_97.add ("Coconut");
          S_97.add ("Medium");
          S_97.add ("grams per kg");
          S_97.add ("");
          S_97.add ("");
          S_97.add ("");

          ArrayList <String> S_98 = new ArrayList <String> ();
          S_98.add ("98");
          S_98.add ("226");
          S_98.add ("Guava");
          S_98.add ("");
          S_98.add ("grams per kg");
          S_98.add ("");
          S_98.add ("");
          S_98.add ("");

          ArrayList <String> S_99 = new ArrayList <String> ();
          S_99.add ("99");
          S_99.add ("227");
          S_99.add ("Singhada");
          S_99.add ("");
          S_99.add ("grams per kg");
          S_99.add ("");
          S_99.add ("");
          S_99.add ("");

          ArrayList <String> S_100 = new ArrayList <String> ();
          S_100.add ("100");
          S_100.add ("228");
          S_100.add ("1- orange");
          S_100.add ("");
          S_100.add ("per dozen");
          S_100.add ("");
          S_100.add ("");
          S_100.add ("");

          ArrayList <String> S_101 = new ArrayList <String> ();
          S_101.add ("101");
          S_101.add ("228");
          S_101.add ("2- mousambi");
          S_101.add ("");
          S_101.add ("grams per kg");
          S_101.add ("");
          S_101.add ("");
          S_101.add ("");

          ArrayList <String> S_102 = new ArrayList <String> ();
          S_102.add ("102");
          S_102.add ("230");
          S_102.add ("papaya");
          S_102.add ("");
          S_102.add ("grams per kg");
          S_102.add ("");
          S_102.add ("");
          S_102.add ("");

          ArrayList <String> S_103 = new ArrayList <String> ();
          S_103.add ("103");
          S_103.add ("231");
          S_103.add ("Common");
          S_103.add ("");
          S_103.add ("grams per kg");
          S_103.add ("");
          S_103.add ("");
          S_103.add ("");

          ArrayList <String> S_104 = new ArrayList <String> ();
          S_104.add ("104");
          S_104.add ("232");
          S_104.add ("Melon");
          S_104.add ("");
          S_104.add ("grams per kg");
          S_104.add ("");
          S_104.add ("");
          S_104.add ("");

          ArrayList <String> S_105 = new ArrayList <String> ();
          S_105.add ("105");
          S_105.add ("233");
          S_105.add ("pear");
          S_105.add ("");
          S_105.add ("grams per kg");
          S_105.add ("");
          S_105.add ("");
          S_105.add ("");

          ArrayList <String> S_106 = new ArrayList <String> ();
          S_106.add ("106");
          S_106.add ("234");
          S_106.add ("plum / badrifal");
          S_106.add ("");
          S_106.add ("grams per kg");
          S_106.add ("");
          S_106.add ("");
          S_106.add ("");

          ArrayList <String> S_107 = new ArrayList <String> ();
          S_107.add ("107");
          S_107.add ("235");
          S_107.add ("Lychee");
          S_107.add ("");
          S_107.add ("grams per kg");
          S_107.add ("");
          S_107.add ("");
          S_107.add ("");

          ArrayList <String> S_108 = new ArrayList <String> ();
          S_108.add ("108");
          S_108.add ("236");
          S_108.add ("apple");
          S_108.add ("");
          S_108.add ("grams per kg");
          S_108.add ("");
          S_108.add ("");
          S_108.add ("");

          ArrayList <String> S_109 = new ArrayList <String> ();
          S_109.add ("109");
          S_109.add ("237");
          S_109.add ("Grapes");
          S_109.add ("");
          S_109.add ("grams per kg");
          S_109.add ("");
          S_109.add ("");
          S_109.add ("");

          ArrayList <String> S_110 = new ArrayList <String> ();
          S_110.add ("110");
          S_110.add ("238");
          S_110.add ("Other (give name) pomegranate");
          S_110.add ("");
          S_110.add ("grams per kg");
          S_110.add ("");
          S_110.add ("");
          S_110.add ("");

          ArrayList <String> S_111 = new ArrayList <String> ();
          S_111.add ("111");
          S_111.add ("240");
          S_111.add ("Coconut (copra)");
          S_111.add ("dry / medium");
          S_111.add ("grams per kg");
          S_111.add ("");
          S_111.add ("");
          S_111.add ("");

          ArrayList <String> S_112 = new ArrayList <String> ();
          S_112.add ("112");
          S_112.add ("241");
          S_112.add ("Peanut");
          S_112.add ("Dana");
          S_112.add ("grams per kg");
          S_112.add ("");
          S_112.add ("");
          S_112.add ("");

          ArrayList <String> S_113 = new ArrayList <String> ();
          S_113.add ("113");
          S_113.add ("242");
          S_113.add ("date");
          S_113.add ("");
          S_113.add ("per 100 grams");
          S_113.add ("");
          S_113.add ("");
          S_113.add ("");

          ArrayList <String> S_114 = new ArrayList <String> ();
          S_114.add ("114");
          S_114.add ("243");
          S_114.add ("Cashew");
          S_114.add ("");
          S_114.add ("per 100 grams");
          S_114.add ("");
          S_114.add ("");
          S_114.add ("");

          ArrayList <String> S_115 = new ArrayList <String> ();
          S_115.add ("115");
          S_115.add ("244");
          S_115.add ("nut");
          S_115.add ("");
          S_115.add ("per 100 grams");
          S_115.add ("");
          S_115.add ("");
          S_115.add ("");

          ArrayList <String> S_116 = new ArrayList <String> ();
          S_116.add ("116");
          S_116.add ("246");
          S_116.add ("KishMish");
          S_116.add ("");
          S_116.add ("per 100 grams");
          S_116.add ("");
          S_116.add ("");
          S_116.add ("");

          ArrayList <String> S_117 = new ArrayList <String> ();
          S_117.add ("117");
          S_117.add ("247");
          S_117.add ("Other (give name) Dry Almond");
          S_117.add ("");
          S_117.add ("per 100 grams");
          S_117.add ("");
          S_117.add ("");
          S_117.add ("");

          ArrayList <String> S_118 = new ArrayList <String> ();
          S_118.add ("118");
          S_118.add ("254");
          S_118.add ("turmeric");
          S_118.add ("");
          S_118.add ("grams per kg");
          S_118.add ("");
          S_118.add ("");
          S_118.add ("");

          ArrayList <String> S_119 = new ArrayList <String> ();
          S_119.add ("119");
          S_119.add ("255");
          S_119.add ("pepper");
          S_119.add ("");
          S_119.add ("per 100 grams");
          S_119.add ("");
          S_119.add ("");
          S_119.add ("");

          ArrayList <String> S_120 = new ArrayList <String> ();
          S_120.add ("120");
          S_120.add ("256");
          S_120.add ("dry chili");
          S_120.add ("");
          S_120.add ("grams per kg");
          S_120.add ("");
          S_120.add ("");
          S_120.add ("");

          ArrayList <String> S_121 = new ArrayList <String> ();
          S_121.add ("121");
          S_121.add ("257");
          S_121.add ("tamarind");
          S_121.add ("");
          S_121.add ("grams per kg");
          S_121.add ("");
          S_121.add ("");
          S_121.add ("");

          ArrayList <String> S_122 = new ArrayList <String> ();
          S_122.add ("122");
          S_122.add ("258");
          S_122.add ("curry powder");
          S_122.add ("Ashoka / Goldie / Naam De");
          S_122.add ("50 gram packet");
          S_122.add ("");
          S_122.add ("");
          S_122.add ("");

          ArrayList <String> S_123 = new ArrayList <String> ();
          S_123.add ("123");
          S_123.add ("915");
          S_123.add ("garam masala");
          S_123.add ("Ashoka / Goldie / Naam De");
          S_123.add ("50 gram packet");
          S_123.add ("");
          S_123.add ("");
          S_123.add ("");

          ArrayList <String> S_124 = new ArrayList <String> ();
          S_124.add ("124");
          S_124.add ("261");
          S_124.add ("Other (give name) issues (grinds)");
          S_124.add ("Ashoka / Goldie / Naam De");
          S_124.add ("50 gram packet");
          S_124.add ("");
          S_124.add ("");
          S_124.add ("");

          ArrayList <String> S_125 = new ArrayList <String> ();
          S_125.add ("125");
          S_125.add ("270");
          S_125.add ("tea cup");
          S_125.add ("ready");
          S_125.add ("each");
          S_125.add ("");
          S_125.add ("");
          S_125.add ("");

          ArrayList <String> S_126 = new ArrayList <String> ();
          S_126.add ("126");
          S_126.add ("271");
          S_126.add ("tea leaf");
          S_126.add ("branded");
          S_126.add ("100 gram packet");
          S_126.add ("");
          S_126.add ("");
          S_126.add ("");

          ArrayList <String> S_127 = new ArrayList <String> ();
          S_127.add ("127");
          S_127.add ("272");
          S_127.add ("coffee cup");
          S_127.add ("ready");
          S_127.add ("each");
          S_127.add ("");
          S_127.add ("");
          S_127.add ("");

          ArrayList <String> S_128 = new ArrayList <String> ();
          S_128.add ("128");
          S_128.add ("273");
          S_128.add ("coffee powder");
          S_128.add ("branded");
          S_128.add ("50 gram packet");
          S_128.add ("");
          S_128.add ("");
          S_128.add ("");

          ArrayList <String> S_129 = new ArrayList <String> ();
          S_129.add ("129");
          S_129.add ("916");
          S_129.add ("Ice");
          S_129.add ("Silli");
          S_129.add ("grams per kg");
          S_129.add ("");
          S_129.add ("");
          S_129.add ("");

          ArrayList <String> S_130 = new ArrayList <String> ();
          S_130.add ("130");
          S_130.add ("275");
          S_130.add ("soft drink bottle");
          S_130.add ("Pepsi / Coca");
          S_130.add ("per liter");
          S_130.add ("");
          S_130.add ("");
          S_130.add ("");

          ArrayList <String> S_131 = new ArrayList <String> ();
          S_131.add ("131");
          S_131.add ("276");
          S_131.add ("fruit juice shake");
          S_131.add ("Moshammy");
          S_131.add ("200ml");
          S_131.add ("");
          S_131.add ("");
          S_131.add ("");

          ArrayList <String> S_132 = new ArrayList <String> ();
          S_132.add ("132");
          S_132.add ("255");
          S_132.add ("Coconut green");
          S_132.add ("");
          S_132.add ("each");
          S_132.add ("");
          S_132.add ("");
          S_132.add ("");

          ArrayList <String> S_133 = new ArrayList <String> ();
          S_133.add ("133");
          S_133.add ("277");
          S_133.add ("Other (give name)");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");
          S_133.add ("");

          ArrayList <String> S_134 = new ArrayList <String> ();
          S_134.add ("134");
          S_134.add ("291");
          S_134.add ("Biscuits");
          S_134.add ("Parle-G / Naam De");
          S_134.add ("100 grams");
          S_134.add ("");
          S_134.add ("");
          S_134.add ("");

          ArrayList <String> S_135 = new ArrayList <String> ();
          S_135.add ("135");
          S_135.add ("292");
          S_135.add ("salty snacks");
          S_135.add ("");
          S_135.add ("grams per kg");
          S_135.add ("");
          S_135.add ("");
          S_135.add ("");

          ArrayList <String> S_136 = new ArrayList <String> ();
          S_136.add ("136");
          S_136.add ("290");
          S_136.add ("ready dessert");
          S_136.add ("1- Jalebi");
          S_136.add ("grams per kg");
          S_136.add ("");
          S_136.add ("");
          S_136.add ("");

          ArrayList <String> S_137 = new ArrayList <String> ();
          S_137.add ("137");
          S_137.add ("290");
          S_137.add ("prepared dessert");
          S_137.add ("2- sweet (give name)");
          S_137.add ("grams per kg");
          S_137.add ("");
          S_137.add ("");
          S_137.add ("");

          ArrayList <String> S_138 = new ArrayList <String> ();
          S_138.add ("138");
          S_138.add ("280");
          S_138.add ("cooked food");
          S_138.add ("ordinary");
          S_138.add ("per thal");
          S_138.add ("");
          S_138.add ("");
          S_138.add ("");

          ArrayList <String> S_139 = new ArrayList <String> ();
          S_139.add ("139");
          S_139.add ("304");
          S_139.add ("1- cake");
          S_139.add ("Medium");
          S_139.add ("each");
          S_139.add ("");
          S_139.add ("");
          S_139.add ("");

          ArrayList <String> S_140 = new ArrayList <String> ();
          S_140.add ("140");
          S_140.add ("304");
          S_140.add ("2-pasty");
          S_140.add ("Medium");
          S_140.add ("each");
          S_140.add ("");
          S_140.add ("");
          S_140.add ("");

          ArrayList <String> S_141 = new ArrayList <String> ();
          S_141.add ("141");
          S_141.add ("294");
          S_141.add ("Pickel");
          S_141.add ("Mix");
          S_141.add ("100 grams");
          S_141.add ("");
          S_141.add ("");
          S_141.add ("");

          ArrayList <String> S_142 = new ArrayList <String> ();
          S_142.add ("142");
          S_142.add ("295");
          S_142.add ("sauce / sauce");
          S_142.add ("Tomato / Chili");
          S_142.add ("100 grams");
          S_142.add ("");
          S_142.add ("");
          S_142.add ("");

          ArrayList <String> S_143 = new ArrayList <String> ();
          S_143.add ("143");
          S_143.add ("295");
          S_143.add ("Murabba / jelly");
          S_143.add ("");
          S_143.add ("100 grams");
          S_143.add ("");
          S_143.add ("");
          S_143.add ("");

          ArrayList <String> S_144 = new ArrayList <String> ();
          S_144.add ("144");
          S_144.add ("296");
          S_144.add ("else (give name)");
          S_144.add ("");
          S_144.add ("");
          S_14.add ("");
          S_144.add ("");
          S_144.add ("");

          List <ArrayList<String>> Foods = new ArrayList <ArrayList <String>> (); // 1-144
          Foods.add (S_1);
          Foods.add (S_2);
          Foods.add (S_3);
          Foods.add (S_4);
          Foods.add (S_5);
          Foods.add (S_6);
          Foods.add (S_7);
          Foods.add (S_8);
          Foods.add (S_9);
          Foods.add (S_10);
          Foods.add (S_11);
          Foods.add (S_12);
          Foods.add (S_13);
          Foods.add (S_14);
          Foods.add (S_15);
          Foods.add (S_16);
          Foods.add (S_17);
          Foods.add (S_18);
          Foods.add (S_19);
          Foods.add (S_20);
          Foods.add (S_21);
          Foods.add (S_22);
          Foods.add (S_23);
          Foods.add (S_24);
          Foods.add (S_25);
          Foods.add (S_26);
          Foods.add (S_27);
          Foods.add (S_28);
          Foods.add (S_29);
          Foods.add (S_30);
          Foods.add (S_31);
          Foods.add (S_32);
          Foods.add (S_33);
          Foods.add (S_34);
          Foods.add (S_35);
          Foods.add (S_36);
          Foods.add (S_37);
          Foods.add (S_38);
          Foods.add (S_39);
          Foods.add (S_40);
          Foods.add (S_41);
          Foods.add (S_42);
          Foods.add (S_43);
          Foods.add (S_44);
          Foods.add (S_45);
          Foods.add (S_46);
          Foods.add (S_47);
          Foods.add (S_48);
          Foods.add (S_49);
          Foods.add (S_50);
          Foods.add (S_51);
          Foods.add (S_52);
          Foods.add (S_53);
          Foods.add (S_54);
          Foods.add (S_55);
          Foods.add (S_56);
          Foods.add (S_57);
          Foods.add (S_58);
          Foods.add (S_59);
          Foods.add (S_60);
          Foods.add (S_61);
          Foods.add (S_62);
          Foods.add (S_63);
          Foods.add (S_64);
          Foods.add (S_65);
          Foods.add (S_66);
          Foods.add (S_67);
          Foods.add (S_68);
          Foods.add (S_69);
          Foods.add (S_70);
          Foods.add (S_71);
          Foods.add (S_72);
          Foods.add (S_73);
          Foods.add (S_74);
          Foods.add (S_75);
          Foods.add (S_76);
          Foods.add (S_77);
          Foods.add (S_78);
          Foods.add (S_79);
          Foods.add (S_80);
          Foods.add (S_81);
          Foods.add (S_82);
          Foods.add (S_83);
          Foods.add (S_84);
          Foods.add (S_85);
          Foods.add (S_86);
          Foods.add (S_87);
          Foods.add (S_88);
          Foods.add (S_89);
          Foods.add (S_90);
          Foods.add (S_91);
          Foods.add (S_92);
          Foods.add (S_93);
          Foods.add (S_94);
          Foods.add (S_95);
          Foods.add (S_96);
          Foods.add (S_97);
          Foods.add (S_98);
          Foods.add (S_99);
          Foods.add (S_100);
          Foods.add (S_101);
          Foods.add (S_102);
          Foods.add (S_103);
          Foods.add (S_104);
          Foods.add (S_105);
          Foods.add (S_106);
          Foods.add (S_107);
          Foods.add (S_108);
          Foods.add (S_109);
          Foods.add (S_110);
          Foods.add (S_111);
          Foods.add (S_112);
          Foods.add (S_113);
          Foods.add (S_114);
          Foods.add (S_115);
          Foods.add (S_116);
          Foods.add (S_117);
          Foods.add (S_118);
          Foods.add (S_119);
          Foods.add (S_120);
          Foods.add (S_121);
          Foods.add (S_122);
          Foods.add (S_123);
          Foods.add (S_124);
          Foods.add (S_125);
          Foods.add (S_126);
          Foods.add (S_127);
          Foods.add (S_128);
          Foods.add (S_129);
          Foods.add (S_130);
          Foods.add (S_131);
          Foods.add (S_132);
          Foods.add (S_133);
          Foods.add (S_134);
          Foods.add (S_135);
          Foods.add (S_136);
          Foods.add (S_137);
          Foods.add (S_138);
          Foods.add (S_139);
          Foods.add (S_140);
          Foods.add (S_141);
          Foods.add (S_142);
          Foods.add (S_143);
          Foods.add (S_144);


          ArrayList <String> S_145 = new ArrayList <String> (); // variable name as Serial No.
          S_145.add ("145");
          S_145.add ("300");
          S_145.add ("Plain Paan");
          S_145.add ("native / qalkatiya");
          S_145.add ("Per Dholi (200)");
          S_145.add ("");
          S_145.add ("");
          S_145.add ("");
          ArrayList <String> S_146 = new ArrayList <String> ();
          S_146.add ("146");
          S_146.add ("301");
          S_146.add ("Tayar Paan");
          S_146.add ("");
          S_146.add ("each");
          S_146.add ("");
          S_146.add ("");
          S_146.add ("");
          ArrayList <String> S_147 = new ArrayList <String> ();
          S_147.add ("147");
          S_147.add ("302");
          S_147.add ("Supari");
          S_147.add ("whole / two piece");
          S_147.add ("grams per kg");
          S_147.add ("");
          S_147.add ("");
          S_147.add ("");
          ArrayList <String> S_148 = new ArrayList <String> ();
          S_148.add ("148");
          S_148.add ("302");
          S_148.add ("chuna");
          S_148.add ("");
          S_148.add ("Packet of 250 grams");
          S_148.add ("");
          S_148.add ("");
          S_148.add ("");

          ArrayList <String> S_149 = new ArrayList <String> ();
          S_149.add ("149");
          S_149.add ("302");
          S_149.add ("Katha");
          S_149.add ("");
          S_149.add ("grams per kg");
          S_149.add ("");
          S_149.add ("");
          S_149.add ("");

          ArrayList <String> S_150 = new ArrayList <String> ();
          S_150.add ("150");
          S_150.add ("917");
          S_150.add ("else (give name)");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          S_150.add ("");
          ArrayList <String> S_151 = new ArrayList <String> ();
          S_151.add ("151");
          S_151.add ("310");
          S_151.add ("bidi (name)");
          S_151.add ("");
          S_151.add ("25 bidi bundle");
          S_151.add ("");
          S_151.add ("");
          S_151.add ("");
          ArrayList <String> S_152 = new ArrayList <String> ();
          S_152.add ("152");
          S_152.add ("311");
          S_152.add ("cigarette (give name)");
          S_152.add ("Medium");
          S_152.add ("20 pieces big size");
          S_152.add ("");
          S_152.add ("");
          S_152.add ("");
          ArrayList <String> S_153 = new ArrayList <String> ();
          S_153.add ("153");
          S_153.add ("312");
          S_153.add ("tobacco leaf");
          S_153.add ("");
          S_153.add ("50 grams");
          S_153.add ("");
          S_153.add ("");
          S_153.add ("");

          ArrayList <String> S_154 = new ArrayList <String> ();
          S_154.add ("154");
          S_154.add ("313");
          S_154.add ("snuff");
          S_154.add ("");
          S_154.add ("50 grams");
          S_154.add ("");
          S_154.add ("");
          S_154.add ("");
          ArrayList <String> S_155 = new ArrayList <String> ();
          S_155.add ("155");
          S_155.add ("314");
          S_155.add ("hookah tobacco");
          S_155.add ("");
          S_155.add ("grams per kg");
          S_155.add ("");
          S_155.add ("");
          S_155.add ("");
          ArrayList <String> S_156 = new ArrayList <String> ();
          S_156.add ("156");
          S_156.add ("315");
          S_156.add ("churat / cigar");
          S_156.add ("");
          S_156.add ("each");
          S_156.add ("");
          S_156.add ("");
          S_156.add ("");
          ArrayList <String> S_157 = new ArrayList <String> ();
          S_157.add ("157");
          S_157.add ("316");
          S_157.add ("Jarda / Suti / Kimam");
          S_157.add ("");
          S_157.add ("50 gram pack");
          S_157.add ("");
          S_157.add ("");
          S_157.add ("");

          ArrayList <String> S_158 = new ArrayList <String> ();
          S_158.add ("158");
          S_158.add ("320");
          S_158.add ("weed");
          S_158.add ("");
          S_158.add ("50 grams");
          S_158.add ("");
          S_158.add ("");
          S_158.add ("");

          ArrayList <String> S_159 = new ArrayList <String> ();
          S_159.add ("159");
          S_159.add ("321");
          S_159.add ("Toddy");
          S_159.add ("");
          S_159.add ("per liter");
          S_159.add ("");
          S_159.add ("");
          S_159.add ("");
          ArrayList <String> S_160 = new ArrayList <String> ();
          S_160.add ("160");
          S_160.add ("322");
          S_160.add ("Desi wine");
          S_160.add ("prevalent / colored");
          S_160.add ("per liter");
          S_160.add ("");
          S_160.add ("");
          S_160.add ("");
          ArrayList <String> S_161 = new ArrayList <String> ();
          S_161.add ("161");
          S_161.add ("323");
          S_161.add ("beer");
          S_161.add ("");
          S_161.add ("750ml");
          S_161.add ("");
          S_161.add ("");
          S_161.add ("");
          ArrayList <String> S_162 = new ArrayList <String> ();
          S_162.add ("162");
          S_162.add ("324");
          S_162.add ("Foreign wines");
          S_162.add ("whiskey / rum");
          S_162.add ("180ml");
          S_162.add ("");
          S_162.add ("");
          S_162.add ("");
          List <ArrayList <String>> Substance = new ArrayList <ArrayList <String>> (); // 1-18
          Substance.add (S_145);
          Substance.add (S_146);
          Substance.add (S_147);
          Substance.add (S_148);
          Substance.add (S_149);
          Substance.add (S_150);
          Substance.add (S_151);
          Substance.add (S_152);
          Substance.add (S_153);
          Substance.add (S_154);
          Substance.add (S_155);
          Substance.add (S_156);
          Substance.add (S_157);
          Substance.add (S_158);
          Substance.add (S_159);
          Substance.add (S_160);
          Substance.add (S_161);
          Substance.add (S_162);

          ArrayList <String> S_163 = new ArrayList <String> (); // variable name as Serial No.
          S_163.add ("163");
          S_163.add ("330");
          S_163.add ("coke / charcoal");
          S_163.add ("");
          S_163.add ("grams per kg");
          S_163.add ("");
          S_163.add ("");
          S_163.add ("");
          ArrayList <String> S_164 = new ArrayList <String> ();
          S_164.add ("164");
          S_164.add ("331");
          S_164.add ("firewood / chelia");
          S_164.add ("");
          S_164.add ("per quintal");
          S_164.add ("");
          S_164.add ("");
          S_164.add ("");
          ArrayList <String> S_165 = new ArrayList <String> ();
          S_165.add ("165");
          S_165.add ("332");
          S_165.add ("Light");
          S_165.add ("up to 100 unit level");
          S_165.add ("per unit");
          S_165.add ("");
          S_165.add ("");
          S_165.add ("");
          ArrayList <String> S_166 = new ArrayList <String> ();
          S_166.add ("166");
          S_166.add ("333");
          S_166.add ("Uplay");
          S_166.add ("");
          S_166.add ("per second");
          S_166.add ("");
          S_166.add ("");
          S_166.add ("");

          ArrayList <String> S_167 = new ArrayList <String> ();
          S_167.add ("167");
          S_167.add ("334");
          S_167.add ("Kerosene oil");
          S_167.add ("white");
          S_167.add ("per liter");
          S_167.add ("");
          S_167.add ("");
          S_167.add ("");

          ArrayList <String> S_168 = new ArrayList <String> ();
          S_168.add ("168");
          S_168.add ("335");
          S_168.add ("Kerosene oil-other (name) cessation");
          S_168.add ("white");
          S_168.add ("per liter");
          S_168.add ("");
          S_168.add ("");
          S_168.add ("");
          ArrayList <String> S_169 = new ArrayList <String> ();
          S_169.add ("169");
          S_169.add ("336");
          S_169.add ("matchbox");
          S_169.add ("");
          S_169.add ("50 sticks per box");
          S_169.add ("");
          S_169.add ("");
          S_169.add ("");
          ArrayList <String> S_170 = new ArrayList <String> ();
          S_170.add ("170");
          S_170.add ("338");
          S_170.add ("LPG Gas (14.2 kg)");
          S_170.add ("Indne / India / H0P");
          S_170.add ("per selender");
          S_170.add ("");
          S_170.add ("");
          S_170.add ("");
          ArrayList <String> S_171 = new ArrayList <String> ();
          S_171.add ("171");
          S_171.add ("337");
          S_171.add ("Charcoal");
          S_171.add ("");
          S_171.add ("grams per kg");
          S_171.add ("");
          S_171.add ("");
          S_171.add ("");

          ArrayList <String> S_172 = new ArrayList <String> ();
          S_172.add ("172");
          S_172.add ("341");
          S_172.add ("Candle");
          S_172.add ("");
          S_172.add ("200 gram packet");
          S_172.add ("");
          S_172.add ("");
          S_172.add ("");

          List <ArrayList <String>> Fuel = new ArrayList <ArrayList <String>> (); // 1-10
          Fuel.add (S_163);
          Fuel.add (S_164);
          Fuel.add (S_165);
          Fuel.add (S_166);
          Fuel.add (S_167);
          Fuel.add (S_168);
          Fuel.add (S_169);
          Fuel.add (S_170);
          Fuel.add (S_171);
          Fuel.add (S_172);

          ArrayList <String> S_173 = new ArrayList <String> (); // variable name as Serial No.
          S_173.add ("173");
          S_173.add ("350");
          S_173.add ("Dhoti cotton without dhuli (masculine)");
          S_173.add ("Average powerloom");
          S_173.add ("4.5 liters");
          S_173.add ("");
          S_173.add ("");
          S_173.add ("");
          ArrayList <String> S_174 = new ArrayList <String> ();
          S_174.add ("174");
          S_174.add ("351");
          S_174.add ("Saree Terricot Medium");
          S_174.add ("33:67");
          S_174.add ("4.5 liters");
          S_174.add ("");
          S_174.add ("");
          S_174.add ("");
          ArrayList <String> S_175 = new ArrayList <String> ();
          S_175.add ("175");
          S_175.add ("352");
          S_175.add ("shirt cloth");
          S_175.add ("terikot");
          S_175.add ("per meter");
          S_175.add ("");
          S_175.add ("");
          S_175.add ("");
          ArrayList <String> S_176 = new ArrayList <String> ();
          S_176.add ("176");
          S_176.add ("353");
          S_176.add ("Pant");
          S_176.add ("terricot");
          S_176.add ("per meter");
          S_176.add ("");
          S_176.add ("");
          S_176.add ("");

          ArrayList <String> S_177 = new ArrayList <String> ();
          S_177.add ("177");
          S_177.add ("355");
          S_177.add ("sheet cover");
          S_177.add ("Bhagalpuri");
          S_177.add ("each");
          S_177.add ("");
          S_177.add ("");
          S_177.add ("");

          ArrayList <String> S_178 = new ArrayList <String> ();
          S_178.add ("178");
          S_178.add ("367");
          S_178.add ("lungi");
          S_178.add ("two meters");
          S_178.add ("each");
          S_178.add ("");
          S_178.add ("");
          S_178.add ("");
          ArrayList <String> S_179 = new ArrayList <String> ();
          S_179.add ("179");
          S_179.add ("371");
          S_179.add ("1- Gamcha/Toliya/Rumaal");
          S_179.add ("flower size / medium / powerloom");
          S_179.add ("each");
          S_179.add ("");
          S_179.add ("");
          S_179.add ("");
          ArrayList <String> S_180 = new ArrayList <String> ();
          S_180.add ("180");
          S_180.add ("371");
          S_180.add ("2-towel");
          S_180.add ("flower size / medium / powerloom");
          S_180.add ("each");
          S_180.add ("");
          S_180.add ("");
          S_180.add ("");

          ArrayList <String> S_181 = new ArrayList <String> ();
          S_181.add ("181");
          S_181.add ("371");
          S_181.add ("3- handkerchief");
          S_181.add ("flower size / medium / powerloom");
          S_181.add ("each");
          S_181.add ("");
          S_181.add ("");
          S_181.add ("");

          ArrayList <String> S_182 = new ArrayList <String> ();
          S_182.add ("182");
          S_182.add ("370");
          S_182.add ("Hosiery goods (name)");
          S_182.add ("Medium");
          S_182.add ("each");
          S_182.add ("");
          S_182.add ("");
          S_182.add ("");

          ArrayList <String> S_183 = new ArrayList <String> ();
          S_183.add ("183");
          S_183.add ("918");
          S_183.add ("Stitched Clothing Jeans Pant");
          S_183.add ("Medium");
          S_183.add ("each");
          S_183.add ("");
          S_183.add ("");
          S_183.add ("");

          ArrayList <String> S_184 = new ArrayList <String> ();
          S_184.add ("184");
          S_184.add ("919");
          S_184.add ("turban / safa");
          S_184.add ("Medium");
          S_184.add ("each");
          S_184.add ("");
          S_184.add ("");
          S_184.add ("");

          ArrayList <String> S_185 = new ArrayList <String> ();
          S_185.add ("185");
          S_185.add ("374");
          S_185.add ("knitting wool");
          S_185.add ("CashMillan");
          S_185.add ("per kg");
          S_185.add ("");
          S_185.add ("");
          S_185.add ("");

          ArrayList <String> S_186 = new ArrayList <String> ();
          S_186.add ("186");
          S_186.add ("380");
          S_186.add ("bed cover / sheet");
          S_186.add ("160 cm X225 cm");
          S_186.add ("each");
          S_186.add ("");
          S_186.add ("");
          S_186.add ("");

          ArrayList <String> S_187 = new ArrayList <String> ();
          S_187.add ("187");
          S_187.add ("381");
          S_187.add ("blanket");
          S_187.add ("Gandhi Ashram");
          S_187.add ("each");
          S_187.add ("");
          S_187.add ("");
          S_187.add ("");
          ArrayList <String> S_188 = new ArrayList <String> ();
          S_188.add ("188");
          S_188.add ("382");
          S_188.add ("pillow");
          S_188.add ("Pham");
          S_188.add ("each");
          S_188.add ("");
          S_188.add ("");
          S_188.add ("");
          ArrayList <String> S_189 = new ArrayList <String> ();
          S_189.add ("189");
          S_189.add ("383");
          S_189.add ("Dresses for curtains");
          S_189.add ("Kissam");
          S_189.add ("per meter");
          S_189.add ("");
          S_189.add ("");
          S_189.add ("");
          ArrayList <String> S_190 = new ArrayList <String> ();
          S_190.add ("190");
          S_190.add ("384");
          S_190.add ("Mosquito donator");
          S_190.add ("ordinary / cotton");
          S_190.add ("each");
          S_190.add ("");
          S_190.add ("");
          S_190.add ("");
          ArrayList <String> S_191 = new ArrayList <String> ();
          S_191.add ("191");
          S_191.add ("920");
          S_191.add ("matting");
          S_191.add ("ordinary");
          S_191.add ("per square foot");
          S_191.add ("");
          S_191.add ("");
          S_191.add ("");
          ArrayList <String> S_192 = new ArrayList <String> ();
          S_192.add ("192");
          S_192.add ("921");
          S_192.add ("Rui");
          S_192.add ("native / no fad");
          S_192.add ("grams per kg");
          S_192.add ("");
          S_192.add ("");
          S_192.add ("");

          List <ArrayList <String>> Clothing = new ArrayList <ArrayList <String>> (); // 1-20
          Clothing.add (S_173);
          Clothing.add (S_174);
          Clothing.add (S_175);
          Clothing.add (S_176);
          Clothing.add (S_177);
          Clothing.add (S_178);
          Clothing.add (S_179);
          Clothing.add (S_180);
          Clothing.add (S_181);
          Clothing.add (S_182);
          Clothing.add (S_183);
          Clothing.add (S_184);
          Clothing.add (S_185);
          Clothing.add (S_186);
          Clothing.add (S_187);
          Clothing.add (S_188);
          Clothing.add (S_189);
          Clothing.add (S_190);
          Clothing.add (S_191);
          Clothing.add (S_192);

          ArrayList <String> S_193 = new ArrayList <String> ();
          S_193.add ("193");
          S_193.add ("390");
          S_193.add ("leather boots, boots");
          S_193.add ("Bata / others");
          S_193.add ("copy added");
          S_193.add ("");
          S_193.add ("");
          S_193.add ("");

          ArrayList <String> S_194 = new ArrayList <String> ();
          S_194.add ("194");
          S_194.add ("391");
          S_194.add ("leather sandals, slippers etc.");
          S_194.add ("Bata / others");
          S_194.add ("copy added");
          S_194.add ("");
          S_194.add ("");
          S_194.add ("");

          ArrayList <String> S_195 = new ArrayList <String> ();
          S_195.add ("195");
          S_195.add ("394");
          S_195.add ("Other (name) sports shoes");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");
          S_195.add ("");

          ArrayList <String> S_196 = new ArrayList <String> ();
          S_196.add ("196");
          S_196.add ("393");
          S_196.add ("Rubber / pvc shoes slippers");
          S_196.add ("ordinary");
          S_196.add ("copy added");
          S_196.add ("");
          S_196.add ("");
          S_196.add ("");

          List <ArrayList <String>> Shoes = new ArrayList <ArrayList <String>> (); // 1-4
          Shoes.add (S_193);
          Shoes.add (S_194);
          Shoes.add (S_195);
          Shoes.add (S_196);



          ArrayList<String> S_197 = new ArrayList<String> ();
          S_197.add ("197");
          S_197.add ("922");
          S_197.add ("Magazine");
          S_197.add ("Kadambini/Others");
          S_197.add ("Per Item");
          S_197.add ("");
          S_197.add ("");
          S_197.add ("");

          ArrayList<String> S_198 = new ArrayList<String> ();
          S_198.add ("198");
          S_198.add ("402");
          S_198.add ("News Paper");
          S_198.add ("Dainik Jagran/Others");
          S_198.add ("Per item");
          S_198.add ("");
          S_198.add ("");
          S_198.add ("");

          ArrayList <String> S_199 = new ArrayList <String> ();
          S_199.add ("199");
          S_199.add ("430");
          S_199.add ("Cinema Tickets");
          S_199.add ("First Row");
          S_199.add ("Per Item");
          S_199.add ("");
          S_199.add ("");
          S_199.add ("");



          ArrayList <String> S_200 = new ArrayList <String> ();
          S_200.add ("200");
          S_200.add ("432");
          S_200.add ("Sports Item (Bat/Ball)");
          S_200.add ("Joint");
          S_200.add ("");
          S_200.add ("");
          S_200.add ("");
          S_200.add ("");

          ArrayList <String> S_201 = new ArrayList <String> (); // variable name as Serial No.
          S_201.add ("201");
          S_201.add ("433");
          S_201.add ("Club Fees");
          S_201.add ("each");
          S_201.add ("");
          S_201.add ("");
          S_201.add ("");
          S_201.add ("");


          ArrayList <String> S_202 = new ArrayList <String> ();
          S_202.add ("202");
          S_202.add ("434");
          S_202.add ("Entertainment and Hobby Items");
          S_202.add ("each");
          S_202.add ("");
          S_202.add ("");
          S_202.add ("");
          S_202.add ("");



          ArrayList <String> S_203 = new ArrayList <String> (); // variable name as Serial No.
          S_203.add ("203");
          S_203.add ("435");
          S_203.add ("Photo Session");
          S_203.add ("In Colorful Studio");
          S_203.add ("Per dozen copies");
          S_203.add ("");
          S_203.add ("");
          S_203.add ("");


          ArrayList <String> S_204 = new ArrayList <String> ();
          S_204.add ("204");
          S_204.add ("437");
          S_204.add ("Cable TV Rent");
          S_204.add ("Per Connection");
          S_204.add ("Per month");
          S_204.add ("");
          S_204.add ("");
          S_204.add ("");



          ArrayList <String> S_205 = new ArrayList <String> (); // variable name as Serial No.
          S_205.add ("205");
          S_205.add ("438");
          S_205.add ("Others(Name)");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");
          S_205.add ("");


          ArrayList <String> S_206 = new ArrayList <String> ();
          S_206.add ("206");
          S_206.add ("440");
          S_206.add ("Prescription Eyeglasses");
          S_206.add ("normal");
          S_206.add ("Per Item");
          S_206.add ("");
          S_206.add ("");
          S_206.add ("");



          ArrayList <String> S_207 = new ArrayList <String> (); // variable name as Serial No.
          S_207.add ("207");
          S_207.add ("441");
          S_207.add ("torch");
          S_207.add ("Jeep/Eveready");
          S_207.add ("Per Item");
          S_207.add ("");
          S_207.add ("");
          S_207.add ("");



          ArrayList <String> S_208 = new ArrayList <String> ();
          S_208.add ("208");
          S_208.add ("442");
          S_208.add ("Lock");
          S_208.add ("normal");
          S_208.add ("Per Item");
          S_208.add ("");
          S_208.add ("");
          S_208.add ("");




          ArrayList <String> S_209 = new ArrayList <String> (); // variable name as Serial No.
          S_209.add ("209");
          S_209.add ("443");
          S_209.add ("Umbrella");
          S_209.add ("Normal");
          S_209.add ("Per Item");
          S_209.add ("");
          S_209.add ("");
          S_209.add ("");

          ArrayList <String> S_210 = new ArrayList <String> ();
          S_210.add ("210");
          S_210.add ("444");
          S_210.add ("Lighter");
          S_210.add ("normal");
          S_210.add ("Per Item");
          S_210.add ("");
          S_210.add ("");
          S_210.add ("");

          ArrayList <String> S_211 = new ArrayList <String> (); // variable name as Serial No.
          S_211.add ("211");
          S_211.add ("450");
          S_211.add ("Bathing Soap");
          S_211.add ("Lifeboy/other(name)");
          S_211.add ("Per Item");
          S_211.add ("");
          S_211.add ("");
          S_211.add ("");


          ArrayList <String> S_212 = new ArrayList <String> ();
          S_212.add ("212");
          S_212.add ("451");
          S_212.add ("1-Toothbrush");
          S_212.add ("Colgate etc");
          S_212.add ("per.");
          S_212.add ("");
          S_212.add ("");
          S_212.add ("");



          ArrayList <String> S_213 = new ArrayList <String> (); // variable name as Serial No.
          S_213.add ("213");
          S_213.add ("451");
          S_213.add ("2- Toothpaste");
          S_213.add ("Colgate, etc.");
          S_213.add ("Per 100 gram");
          S_213.add ("");
          S_213.add ("");
          S_213.add ("");


          ArrayList <String> S_214 = new ArrayList <String> ();
          S_214.add ("214");
          S_214.add ("451");
          S_214.add ("3- Comb");
          S_214.add ("Medium");
          S_214.add ("Per");
          S_214.add ("");
          S_214.add ("");
          S_214.add ("");



          ArrayList <String> S_215 = new ArrayList <String> (); // variable name as Serial No.
          S_215.add ("215");
          S_215.add ("451");
          S_215.add ("1- Talcum Powder");
          S_215.add ("Ponds/equivalent");
          S_215.add ("Per 100 gram");
          S_215.add ("");
          S_215.add ("");
          S_215.add ("");


          ArrayList <String> S_216 = new ArrayList <String> ();
          S_216.add ("216");
          S_216.add ("452");
          S_216.add ("2-Face cream");
          S_216.add ("Ponds/Equivalent");
          S_216.add ("Per 50 gram");
          S_216.add ("");
          S_216.add ("");
          S_216.add ("");



          ArrayList <String> S_217 = new ArrayList <String> (); // variable name as Serial No.
          S_217.add ("217");
          S_217.add ("453");
          S_217.add ("1-Hair Oil");
          S_217.add ("Dabur/Amla/Others");
          S_217.add ("100 gm pack");
          S_217.add ("");
          S_217.add ("");
          S_217.add ("");



          ArrayList <String> S_218 = new ArrayList <String> ();
          S_218.add ("218");
          S_218.add ("453");
          S_218.add ("2-Shampoo");
          S_218.add ("Name");
          S_218.add ("100 gm pack");
          S_218.add ("");
          S_218.add ("");
          S_218.add ("");



          ArrayList <String> S_219 = new ArrayList <String> (); // variable name as Serial No.
          S_219.add ("219");
          S_219.add ("454");
          S_219.add ("Shaving Blade");
          S_219.add ("Topaz/others");
          S_219.add ("Per 5 blade packet");
          S_219.add ("");
          S_219.add ("");
          S_219.add ("");



          ArrayList <String> S_220 = new ArrayList <String> ();
          S_220.add ("220");
          S_220.add ("455");
          S_220.add ("Shaving Cream");
          S_220.add ("Fa/others");
          S_220.add ("100 gram pack");
          S_220.add ("");
          S_220.add ("");
          S_220.add ("");

          ArrayList <String> S_221 = new ArrayList <String> (); // variable name as Serial No.
          S_221.add ("221");
          S_221.add ("456");
          S_221.add ("Sanitary Napkins");
          S_221.add ("Popular");
          S_221.add ("Per Item");
          S_221.add ("");
          S_221.add ("");
          S_221.add ("");


          ArrayList <String> S_222 = new ArrayList <String> ();
          S_222.add ("222");
          S_222.add ("Electric Battery");
          S_222.add ("");
          S_222.add ("Per Item");
          S_222.add ("");
          S_222.add ("");
          S_222.add ("");
          S_222.add ("");



          ArrayList <String> S_223 = new ArrayList <String> (); // variable name as Serial No.
          S_223.add ("223");
          S_223.add ("");
          S_223.add ("Others(Name)");
          S_223.add ("");
          S_223.add ("Per");
          S_223.add ("");
          S_223.add ("");
          S_223.add ("");


          ArrayList <String> S_224 = new ArrayList <String> ();
          S_224.add ("224");
          S_224.add ("463");
          S_224.add ("Kulhad");
          S_224.add ("Normal Size");
          S_224.add ("Per dozen");
          S_224.add ("");
          S_224.add ("");
          S_224.add ("");



          ArrayList <String> S_225 = new ArrayList <String> (); // variable name as Serial No.
          S_225.add ("225");
          S_225.add ("464");
          S_225.add ("Glass tumblers");
          S_225.add ("normal");
          S_225.add ("Per dozen");
          S_225.add ("");
          S_225.add ("");
          S_225.add ("");


          ArrayList <String> S_226 = new ArrayList <String> ();
          S_226.add ("226");
          S_226.add ("465");
          S_226.add ("1- Steel Bucket");
          S_226.add ("10 liter");
          S_226.add ("Per Item");
          S_226.add ("");
          S_226.add ("");
          S_226.add ("");



          ArrayList <String> S_227 = new ArrayList <String> (); // variable name as Serial No.
          S_227.add ("227");
          S_227.add ("");
          S_227.add ("2- Plastic Bucket");
          S_227.add ("20 liter");
          S_227.add ("Per Item");
          S_227.add ("");
          S_227.add ("");
          S_227.add ("");


          ArrayList <String> S_228 = new ArrayList <String> ();
          S_228.add ("228");
          S_228.add ("");
          S_228.add ("3-Baby Feeding Bottle");
          S_228.add ("With Nipple");
          S_228.add ("Per Item");
          S_228.add ("");
          S_228.add ("");
          S_228.add ("");



          ArrayList <String> S_229 = new ArrayList <String> (); // variable name as Serial No.
          S_229.add ("229");
          S_229.add ("466");
          S_229.add ("Wire/Rope");
          S_229.add ("Plastic/Joot");
          S_229.add ("Per Kg");
          S_229.add ("");
          S_229.add ("");
          S_229.add ("");


          ArrayList <String> S_230 = new ArrayList <String> ();
          S_230.add ("230");
          S_230.add ("467");
          S_230.add ("Washing Soap for clothes");
          S_230.add ("Rin");
          S_230.add ("250 gram bar");
          S_230.add ("");
          S_230.add ("");
          S_230.add ("");

          ArrayList <String> S_231 = new ArrayList <String> (); // variable name as Serial No.
          S_231.add ("231");
          S_231.add ("470");
          S_231.add ("Incense stick");
          S_231.add ("");
          S_231.add ("Per Item");
          S_231.add ("");
          S_231.add ("");
          S_231.add ("");


          ArrayList <String> S_232 = new ArrayList <String> ();
          S_232.add ("232");
          S_232.add ("472");
          S_232.add ("1-Insecticide");
          S_232.add ("Type be given");
          S_232.add ("Per Kilogram");
          S_232.add ("");
          S_232.add ("");
          S_232.add ("");



          ArrayList <String> S_233 = new ArrayList <String> (); // variable name as Serial No.
          S_233.add ("233");
          S_233.add ("472");
          S_233.add ("2-acid");
          S_233.add ("Type be given");
          S_233.add ("Per liter");
          S_233.add ("");
          S_233.add ("");
          S_233.add ("");


          ArrayList <String> S_234 = new ArrayList <String> ();
          S_234.add ("234");
          S_234.add ("480");
          S_234.add ("1- Household Servant");
          S_234.add ("");
          S_234.add ("Each, per month");
          S_234.add ("");
          S_234.add ("");
          S_234.add ("");



          ArrayList <String> S_235 = new ArrayList <String> (); // variable name as Serial No.
          S_235.add ("235");
          S_235.add ("480");
          S_235.add ("2- Cook");
          S_235.add ("");
          S_235.add ("Each, per month");
          S_235.add ("");
          S_235.add ("");
          S_235.add ("");


          ArrayList <String> S_236 = new ArrayList <String> ();
          S_236.add ("236");
          S_236.add ("482");
          S_236.add ("3- House Cleaner");
          S_236.add ("");
          S_236.add ("Each, per month");
          S_236.add ("");
          S_236.add ("");
          S_236.add ("");



          ArrayList <String> S_237 = new ArrayList <String> (); // variable name as Serial No.
          S_237.add ("237");
          S_237.add ("483");
          S_237.add ("Barber");
          S_237.add ("1- Urban without beard");
          S_237.add ("Per Hair Cut");
          S_237.add ("");
          S_237.add ("");
          S_237.add ("");



          ArrayList <String> S_238 = new ArrayList <String> ();
          S_238.add ("238");
          S_238.add ("");
          S_238.add ("");
          S_238.add ("2- Rural without beard");
          S_238.add ("Per Hair Cut");
          S_238.add ("");
          S_238.add ("");
          S_238.add ("");



          ArrayList <String> S_239 = new ArrayList <String> (); // variable name as Serial No.
          S_239.add ("239");
          S_239.add ("484");
          S_239.add ("1- Laundry");
          S_239.add ("Suti Cloth");
          S_239.add ("Per Cloth");
          S_239.add ("");
          S_239.add ("");
          S_239.add ("");



          ArrayList <String> S_240 = new ArrayList <String> ();
          S_240.add ("240");
          S_240.add ("484");
          S_240.add ("2- Laundry (COAT)");
          S_240.add ("Woolen/Terracot");
          S_240.add ("Per Suit");
          S_240.add ("");
          S_240.add ("");
          S_240.add ("");

          ArrayList <String> S_241 = new ArrayList <String> (); // variable name as Serial No.
          S_241.add ("241");
          S_241.add ("484");
          S_241.add ("3- Ironing of clothes");
          S_241.add ("Suti/Terracot");
          S_241.add ("Per Cloth");
          S_241.add ("");
          S_241.add ("");
          S_241.add ("");


          ArrayList <String> S_242 = new ArrayList <String> ();
          S_242.add ("242");
          S_242.add ("485");
          S_242.add ("1- Tailor (Shirt)");
          S_242.add ("Suti/Terracot");
          S_242.add ("Per Cloth");
          S_242.add ("");
          S_242.add ("");
          S_242.add ("");



          ArrayList <String> S_243 = new ArrayList <String> (); // variable name as Serial No.
          S_243.add ("243");
          S_243.add ("485");
          S_243.add ("2- Tailor(Pants)");
          S_243.add ("Suti/Terracot");
          S_243.add ("Per Cloth");
          S_243.add ("");
          S_243.add ("");
          S_243.add ("");


          ArrayList <String> S_244 = new ArrayList <String> ();
          S_244.add ("244");
          S_244.add ("485");
          S_244.add ("1- Tailor( Shirt and Pants)");
          S_244.add ("Suti/Terracot");
          S_244.add ("Per Pair");
          S_244.add ("");
          S_244.add ("");
          S_244.add ("");



          ArrayList <String> S_245 = new ArrayList <String> (); // variable name as Serial No.
          S_245.add ("245");
          S_245.add ("490");
          S_245.add ("Mail(Post Card)");
          S_245.add ("Governmental");
          S_245.add ("Per Item");
          S_245.add ("");
          S_245.add ("");
          S_245.add ("");


          ArrayList <String> S_246 = new ArrayList <String> ();
          S_246.add ("246");
          S_246.add ("486");
          S_246.add ("1- Milling - Flour");
          S_246.add ("");
          S_246.add ("Per Kilogram");
          S_246.add ("");
          S_246.add ("");
          S_246.add ("");



          ArrayList <String> S_247 = new ArrayList <String> (); // variable name as Serial No.
          S_247.add ("247");
          S_247.add ("486");
          S_247.add ("2- Milling - Spices");
          S_247.add ("Per Kilogram");
          S_247.add ("");
          S_247.add ("");
          S_247.add ("");
          S_247.add ("");



          ArrayList <String> S_248 = new ArrayList <String> ();
          S_248.add ("248");
          S_248.add ("500");
          S_248.add ("Airplane Fare");
          S_248.add ("general category");
          S_248.add ("Per 100 Kilometer");
          S_248.add ("");
          S_248.add ("");
          S_248.add ("");



          ArrayList <String> S_249 = new ArrayList <String> (); // variable name as Serial No.
          S_249.add ("249");
          S_249.add ("501");
          S_249.add ("Train Fare");
          S_249.add ("1- Express for urban areas");
          S_249.add ("Per 100 Kilometer");
          S_249.add ("");
          S_249.add ("");
          S_249.add ("");



          ArrayList <String> S_250 = new ArrayList <String> ();
          S_250.add ("250");
          S_250.add ("");
          S_250.add ("");
          S_250.add ("2- Express for rural areas");
          S_250.add ("Per 100 Kilometer");
          S_250.add ("");
          S_250.add ("");
          S_250.add ("");

          ArrayList <String> S_251 = new ArrayList <String> (); // variable name as Serial No.
          S_251.add ("251");
          S_251.add ("502");
          S_251.add ("Bus / tram travel Fare");
          S_251.add ("");
          S_251.add ("Per 100 Kilometer");
          S_251.add ("");
          S_251.add ("");
          S_251.add ("");


          ArrayList <String> S_252 = new ArrayList <String> ();
          S_252.add ("252");
          S_252.add ("503");
          S_252.add ("1- Taxi Fare");
          S_252.add ("");
          S_252.add ("Per Kilometer");
          S_252.add ("");
          S_252.add ("");
          S_252.add ("");



          ArrayList <String> S_253 = new ArrayList <String> (); // variable name as Serial No.
          S_253.add ("253");
          S_253.add ("");
          S_253.add ("2- Autorickshaw Fare");
          S_253.add ("");
          S_253.add ("Per Kilometer");
          S_253.add ("");
          S_253.add ("");
          S_253.add ("");


          ArrayList <String> S_254 = new ArrayList <String> ();
          S_254.add ("254");
          S_254.add ("504");
          S_254.add ("1- Steamer Fare");
          S_254.add ("");
          S_254.add ("Per Kilometer");
          S_254.add ("");
          S_254.add ("");
          S_254.add ("");



          ArrayList <String> S_255 = new ArrayList <String> (); // variable name as Serial No.
          S_255.add ("255");
          S_255.add ("");
          S_255.add ("2- Boat Fare");
          S_255.add ("");
          S_255.add ("Per Kilometer");
          S_255.add ("");
          S_255.add ("");
          S_255.add ("");


          ArrayList <String> S_256 = new ArrayList <String> ();
          S_256.add ("256");
          S_256.add ("505");
          S_256.add ("Rickshaw fare(Cycle or Hand)");
          S_256.add ("");
          S_256.add ("Per Kilometerr");
          S_256.add ("");
          S_256.add ("");
          S_256.add ("");



          ArrayList <String> S_257 = new ArrayList <String> (); // variable name as Serial No.
          S_257.add ("257");
          S_257.add ("506");
          S_257.add ("Horse Wagon");
          S_257.add ("Per Kilometer");
          S_257.add ("");
          S_257.add ("");
          S_257.add ("");
          S_257.add ("");



          ArrayList <String> S_258 = new ArrayList <String> ();
          S_258.add ("258");
          S_258.add ("508");
          S_258.add ("Petrol");
          S_258.add ("Scheduled price");
          S_258.add ("Per Liter");
          S_258.add ("");
          S_258.add ("");
          S_258.add ("");



          ArrayList <String> S_259 = new ArrayList <String> (); // variable name as Serial No.
          S_259.add ("259");
          S_259.add ("510");
          S_259.add ("Diesel");
          S_259.add ("Scheduled price");
          S_259.add ("Per Liter");
          S_259.add ("");
          S_259.add ("");
          S_259.add ("");



          ArrayList <String> S_260 = new ArrayList <String> ();
          S_260.add ("260");
          S_260.add ("511");
          S_260.add ("Lubraction");
          S_260.add ("Scheduled price");
          S_260.add ("Per Liter");
          S_260.add ("");
          S_260.add ("");
          S_260.add ("");


          ArrayList <String> S_261 = new ArrayList <String> (); // variable name as Serial No.
          S_261.add ("261");
          S_261.add ("520");
          S_261.add ("1- House Rent(Actual)");
          S_261.add ("Per permanent room");
          S_261.add ("Monthly");
          S_261.add ("");
          S_261.add ("");
          S_261.add ("");


          ArrayList <String> S_262 = new ArrayList <String> ();
          S_262.add ("262");
          S_262.add ("");
          S_262.add ("2- Garage Rent(Actual)");
          S_262.add ("One Garage");
          S_262.add ("Monthly");
          S_262.add ("");
          S_262.add ("");
          S_262.add ("");



          ArrayList <String> S_263 = new ArrayList <String> (); // variable name as Serial No.
          S_263.add ("263");
          S_263.add ("522");
          S_263.add ("Housing Land Rent");
          S_263.add ("");
          S_263.add ("Sq ft / yearly");
          S_263.add ("");
          S_263.add ("");
          S_263.add ("");


          ArrayList <String> S_264 = new ArrayList <String> ();
          S_264.add ("264");
          S_264.add ("539");
          S_264.add ("House Tax");
          S_264.add ("permanent");
          S_264.add ("Annual / per square foot");
          S_264.add ("");
          S_264.add ("");
          S_264.add ("");



          ArrayList <String> S_265 = new ArrayList <String> (); // variable name as Serial No.
          S_265.add ("265");
          S_265.add ("540");
          S_265.add ("Water charges");
          S_265.add ("");
          S_265.add ("Yearly");
          S_265.add ("");
          S_265.add ("");
          S_265.add ("");


          ArrayList <String> S_266 = new ArrayList <String> ();
          S_266.add ("266");
          S_266.add ("550");
          S_266.add ("Single Bed");
          S_266.add ("Wooden / medium / sunmica");
          S_266.add ("Per Item");
          S_266.add ("");
          S_266.add ("");
          S_266.add ("");



          ArrayList <String> S_267 = new ArrayList <String> (); // variable name as Serial No.
          S_267.add ("267");
          S_267.add ("551");
          S_267.add ("1. Wardrobe");
          S_267.add ("Iron / medium");
          S_267.add ("Per Item");
          S_267.add ("");
          S_267.add ("");
          S_267.add ("");



          ArrayList <String> S_268 = new ArrayList <String> ();
          S_268.add ("268");
          S_268.add ("");
          S_268.add ("2. Dressing Table");
          S_268.add ("Wooden / medium");
          S_268.add ("Per Item");
          S_268.add ("");
          S_268.add ("");
          S_268.add ("");



          ArrayList <String> S_269 = new ArrayList <String> (); // variable name as Serial No.
          S_269.add ("269");
          S_269.add ("552");
          S_269.add ("1. Chair");
          S_269.add ("Wooden / medium");
          S_269.add ("Per Item");
          S_269.add ("");
          S_269.add ("");
          S_269.add ("");


          ArrayList <String> S_270 = new ArrayList <String> ();
          S_270.add ("270");
          S_270.add ("");
          S_270.add ("2. Stool");
          S_270.add ("Simple/Wooden");
          S_270.add ("Per Item");
          S_270.add ("");
          S_270.add ("");
          S_270.add ("");

          ArrayList <String> S_271 = new ArrayList <String> (); // variable name as Serial No.
          S_271.add ("271");
          S_271.add ("");
          S_271.add ("3. Bench");
          S_271.add ("Simple/Wooden");
          S_271.add ("Per Item");
          S_271.add ("");
          S_271.add ("");
          S_271.add ("");


          ArrayList <String> S_272 = new ArrayList <String> ();
          S_272.add ("272");
          S_272.add ("");
          S_272.add ("4. Table");
          S_272.add ("simple/wooden");
          S_272.add ("Per Item");
          S_272.add ("");
          S_272.add ("");
          S_272.add ("");



          ArrayList <String> S_273 = new ArrayList <String> (); // variable name as Serial No.
          S_273.add ("273");
          S_273.add ("553");
          S_273.add ("Suitcase");
          S_273.add ("Medium Size/Give Size");
          S_273.add ("Per Item");
          S_273.add ("");
          S_273.add ("");
          S_273.add ("");


          ArrayList <String> S_274 = new ArrayList <String> ();
          S_274.add ("274");
          S_274.add ("554");
          S_274.add ("Cushion");
          S_274.add ("Medium Size");
          S_274.add ("Per Item");
          S_274.add ("");
          S_274.add ("");
          S_274.add ("");



          ArrayList <String> S_275 = new ArrayList <String> (); // variable name as Serial No.
          S_275.add ("275");
          S_275.add ("555");
          S_275.add ("Carpets and Floor Mats");
          S_275.add ("Medium");
          S_275.add ("per square foot");
          S_275.add ("");
          S_275.add ("");
          S_275.add ("");


          ArrayList <String> S_276 = new ArrayList <String> ();
          S_276.add ("276");
          S_276.add ("560");
          S_276.add ("Gramophone and record player");
          S_276.add ("Variety be given");
          S_276.add ("Per Item");
          S_276.add ("");
          S_276.add ("");
          S_276.add ("");



          ArrayList <String> S_277 = new ArrayList <String> (); // variable name as Serial No.
          S_277.add ("277");
          S_277.add ("");
          S_277.add ("Radio (2 Bands)");
          S_277.add ("Variety be given");
          S_277.add ("Per Item");
          S_277.add ("");
          S_277.add ("");
          S_277.add ("");



          ArrayList <String> S_278 = new ArrayList <String> ();
          S_278.add ("278");
          S_278.add ("561");
          S_278.add ("21 inch color tv");
          S_278.add ("LG/BPL/Others");
          S_278.add ("Per Item");
          S_278.add ("");
          S_278.add ("");
          S_278.add ("");



          ArrayList <String> S_279 = new ArrayList <String> (); // variable name as Serial No.
          S_279.add ("279");
          S_279.add ("923");
          S_279.add ("B.C.R./B.C.P./D.V.D.");
          S_279.add ("Give type");
          S_279.add ("Per Item");
          S_279.add ("");
          S_279.add ("");
          S_279.add ("");

          ArrayList <String> S_280 = new ArrayList <String> ();
          S_280.add ("280");
          S_280.add ("563");
          S_280.add ("Camera and photography");
          S_280.add ("Give Type");
          S_280.add ("Per Item");
          S_280.add ("");
          S_280.add ("");
          S_280.add ("");

          ArrayList <String> S_281 = new ArrayList <String> ();
          S_281.add ("281");
          S_281.add ("562");
          S_281.add ("1. Tape Recorder");
          S_281.add ("Give Type");
          S_281.add ("Per Item");
          S_281.add ("");
          S_281.add ("");
          S_281.add ("");

          ArrayList <String> S_282 = new ArrayList <String> (); // variable name as Serial No.
          S_282.add ("282");
          S_282.add ("");
          S_282.add ("CD Player");
          S_282.add ("Give Type");
          S_282.add ("Per Item");
          S_282.add ("");
          S_282.add ("");
          S_282.add ("");






          ArrayList <String> S_283 = new ArrayList <String> (); // variable name as Serial No.
          S_283.add ("283");
          S_283.add ("");
          S_283.add ("Audio / Video CD");
          S_283.add ("Give Type");
          S_283.add ("Per Item");
          S_283.add ("");
          S_283.add ("");
          S_283.add ("");


          ArrayList <String> S_284 = new ArrayList <String> ();
          S_284.add ("284");
          S_284.add ("565");
          S_284.add ("Other device(Name)");
          S_284.add ("Give type");
          S_284.add ("Per Item");
          S_284.add ("");
          S_284.add ("");
          S_284.add ("");



          ArrayList <String> S_285 = new ArrayList <String> (); // variable name as Serial No.
          S_285.add ("285");
          S_285.add ("640");
          S_285.add ("Gold jewelry");
          S_285.add ("22 carat");
          S_285.add ("Per ten gram");
          S_285.add ("");
          S_285.add ("");
          S_285.add ("");


          ArrayList <String> S_286 = new ArrayList <String> ();
          S_286.add ("286");
          S_286.add ("641");
          S_286.add ("Silver jewelry");
          S_286.add ("");
          S_286.add ("Per Kilogram");
          S_286.add ("");
          S_286.add ("");
          S_286.add ("");



          ArrayList <String> S_287 = new ArrayList <String> (); // variable name as Serial No.
          S_287.add ("287");
          S_287.add ("643");
          S_287.add ("Gems (diamond)");
          S_287.add ("Mention Name");
          S_287.add ("Per ratti");
          S_287.add ("");
          S_287.add ("");
          S_287.add ("");



          ArrayList <String> S_288 = new ArrayList <String> ();
          S_288.add ("288");
          S_288.add ("642");
          S_288.add ("Pearl");
          S_288.add ("");
          S_288.add ("Per ratti");
          S_288.add ("");
          S_288.add ("");
          S_288.add ("");



          ArrayList <String> S_289 = new ArrayList <String> (); // variable name as Serial No.
          S_289.add ("289");
          S_289.add ("570");
          S_289.add ("Stainless steel utensils");
          S_289.add ("");
          S_289.add ("Per Kilogram");
          S_289.add ("");
          S_289.add ("");
          S_289.add ("");



          ArrayList <String> S_290 = new ArrayList <String> ();
          S_290.add ("290");
          S_290.add ("572");
          S_290.add ("Water bottle with thermos");
          S_290.add ("of 1 Liter");
          S_290.add ("Per Item");
          S_290.add ("");
          S_290.add ("");
          S_290.add ("");
          ArrayList <String> S_291 = new ArrayList <String> (); // variable name as Serial No.
          S_291.add ("291");
          S_291.add ("571");
          S_291.add ("Other (Name) Kakri");
          S_291.add ("Of sugar");
          S_291.add ("6 pieces");
          S_291.add ("");
          S_291.add ("");
          S_291.add ("");


          ArrayList <String> S_292 = new ArrayList <String> ();
          S_292.add ("292");
          S_292.add ("580");
          S_292.add ("Electric fan");
          S_292.add ("48 inches");
          S_292.add ("Per Item");
          S_292.add ("");
          S_292.add ("");
          S_292.add ("");



          ArrayList <String> S_293 = new ArrayList <String> (); // variable name as Serial No.
          S_293.add ("293");
          S_293.add ("581");
          S_293.add ("air conditioner");
          S_293.add ("Give company name");
          S_293.add ("Per Item");
          S_293.add ("");
          S_293.add ("");
          S_293.add ("");


          ArrayList <String> S_294 = new ArrayList <String> ();
          S_294.add ("294");
          S_294.add ("");
          S_294.add ("Cooler");
          S_294.add ("Give company name");
          S_294.add ("Per Item");
          S_294.add ("");
          S_294.add ("");
          S_294.add ("");



          ArrayList <String> S_295 = new ArrayList <String> (); // variable name as Serial No.
          S_295.add ("295");
          S_295.add ("583");
          S_295.add ("1 lantern");
          S_295.add ("Simple");
          S_295.add ("Per Item");
          S_295.add ("");
          S_295.add ("");
          S_295.add ("");


          ArrayList <String> S_296 = new ArrayList <String> ();
          S_296.add ("296");
          S_296.add ("");
          S_296.add ("2 lamps");
          S_296.add ("Simple");
          S_296.add ("Per Item");
          S_296.add ("");
          S_296.add ("");
          S_296.add ("");



          ArrayList <String> S_297 = new ArrayList <String> (); // variable name as Serial No.
          S_297.add ("297");
          S_297.add ("");
          S_297.add ("3. Electric Lamp shed");
          S_297.add ("Simple");
          S_297.add ("Per item");
          S_297.add ("");
          S_297.add ("");
          S_297.add ("");



          ArrayList <String> S_298 = new ArrayList <String> ();
          S_298.add ("298");
          S_298.add ("584");
          S_298.add ("sewing machine");
          S_298.add ("Usha / Singer / Others");
          S_298.add ("per Item");
          S_298.add ("");
          S_298.add ("");
          S_298.add ("");



          ArrayList <String> S_299 = new ArrayList <String> (); // variable name as Serial No.
          S_299.add ("299");
          S_299.add ("585");
          S_299.add ("Washing machine");
          S_299.add ("Semi Automatic / name");
          S_299.add ("per Item");
          S_299.add ("");
          S_299.add ("");
          S_299.add ("");



          List<ArrayList<String>> Entertainment_And_Other = new ArrayList<ArrayList<String>>();     //197-210
          Entertainment_And_Other.add(S_197);
          Entertainment_And_Other.add(S_198);
          Entertainment_And_Other.add(S_199);
          Entertainment_And_Other.add(S_200);
          Entertainment_And_Other.add(S_201);
          Entertainment_And_Other.add(S_202);
          Entertainment_And_Other.add(S_203);
          Entertainment_And_Other.add(S_204);
          Entertainment_And_Other.add(S_205);
          Entertainment_And_Other.add(S_206);
          Entertainment_And_Other.add(S_207);
          Entertainment_And_Other.add(S_208);
          Entertainment_And_Other.add(S_209);
          Entertainment_And_Other.add(S_210);


          List<ArrayList<String>> Other_Beauty_Product = new ArrayList<ArrayList<String>>();     //211-223

          Other_Beauty_Product.add(S_211);
          Other_Beauty_Product.add(S_212);
          Other_Beauty_Product.add(S_213);
          Other_Beauty_Product.add(S_214);
          Other_Beauty_Product.add(S_215);
          Other_Beauty_Product.add(S_216);
          Other_Beauty_Product.add(S_217);
          Other_Beauty_Product.add(S_218);
          Other_Beauty_Product.add(S_219);
          Other_Beauty_Product.add(S_221);
          Other_Beauty_Product.add(S_222);
          Other_Beauty_Product.add(S_223);

          List<ArrayList<String>> Utensils = new ArrayList<ArrayList<String>>();     //224-233

          Utensils.add(S_224);
          Utensils.add(S_225);
          Utensils.add(S_226);
          Utensils.add(S_227);
          Utensils.add(S_228);
          Utensils.add(S_229);
          Utensils.add(S_230);
          Utensils.add(S_231);
          Utensils.add(S_232);
          Utensils.add(S_233);

          List<ArrayList<String>> Services = new ArrayList<ArrayList<String>>();     //234-247

          Services.add(S_234);
          Services.add(S_235);
          Services.add(S_236);
          Services.add(S_237);
          Services.add(S_238);
          Services.add(S_239);
          Services.add(S_240);
          Services.add(S_241);
          Services.add(S_242);
          Services.add(S_243);
          Services.add(S_244);
          Services.add(S_245);
          Services.add(S_246);
          Services.add(S_247);

          List<ArrayList<String>> Transportation_Services = new ArrayList<ArrayList<String>>();     //248-260
          Transportation_Services.add(S_248);
          Transportation_Services.add(S_249);
          Transportation_Services.add(S_250);
          Transportation_Services.add(S_251);
          Transportation_Services.add(S_252);
          Transportation_Services.add(S_253);
          Transportation_Services.add(S_254);
          Transportation_Services.add(S_255);
          Transportation_Services.add(S_256);
          Transportation_Services.add(S_257);
          Transportation_Services.add(S_258);
          Transportation_Services.add(S_259);
          Transportation_Services.add(S_260);


          List<ArrayList<String>> Rent_And_Loan = new ArrayList<ArrayList<String>>();     //261-265
          Rent_And_Loan.add(S_261);
          Rent_And_Loan.add(S_262);
          Rent_And_Loan.add(S_263);
          Rent_And_Loan.add(S_264);
          Rent_And_Loan.add(S_265);

          List<ArrayList<String>> Other_home_services = new ArrayList<ArrayList<String>>();     //265-284



          Other_home_services.add(S_266);
          Other_home_services.add(S_267);
          Other_home_services.add(S_268);
          Other_home_services.add(S_269);
          Other_home_services.add(S_270);
          Other_home_services.add(S_271);
          Other_home_services.add(S_272);
          Other_home_services.add(S_273);
          Other_home_services.add(S_274);
          Other_home_services.add(S_275);
          Other_home_services.add(S_276);
          Other_home_services.add(S_277);
          Other_home_services.add(S_278);
          Other_home_services.add(S_279);
          Other_home_services.add(S_280);
          Other_home_services.add(S_281);
          Other_home_services.add(S_282);
          Other_home_services.add(S_283);
          Other_home_services.add(S_284);


          List<ArrayList<String>> Jewelry= new ArrayList<ArrayList<String>>();     //284-288
          Jewelry.add(S_285);
          Jewelry.add(S_286);
          Jewelry.add(S_287);
          Jewelry.add(S_288);




          ArrayList <String> S_300 = new ArrayList <String> (); // variable name as Serial No.
          S_300.add ("300");
          S_300.add ("586");
          S_300.add ("stove brass");
          S_300.add ("Mention name");
          S_300.add ("each");
          S_300.add ("");
          S_300.add ("");
          S_300.add ("");


          ArrayList <String> S_301 = new ArrayList <String> (); // variable name as Serial No.
          S_301.add ("301");
          S_301.add ("");
          S_301.add ("2. stove with wick");
          S_301.add ("Mention name");
          S_301.add ("each");
          S_301.add ("");
          S_301.add ("");
          S_301.add ("");


          ArrayList <String> S_302 = new ArrayList <String> ();
          S_302.add ("302");
          S_302.add ("");
          S_302.add ("3. Gas stove");
          S_302.add ("two stove");
          S_302.add ("per cylinder");
          S_302.add ("");
          S_302.add ("");
          S_302.add ("");


          ArrayList <String> S_303 = new ArrayList <String> (); // variable name as Serial No.
          S_303.add ("303");
          S_303.add ("587");
          S_303.add ("pressure cooker");
          S_303.add ("Name per 5 liters");
          S_303.add ("each");
          S_303.add ("");
          S_303.add ("");
          S_303.add ("");



          ArrayList <String> S_304 = new ArrayList <String> ();
          S_304.add ("304");
          S_304.add ("588");
          S_304.add ("Refrigerator (name the company)");
          S_304.add ("per 165 liters");
          S_304.add ("each");
          S_304.add ("");
          S_304.add ("");
          S_304.add ("");



          ArrayList <String> S_305 = new ArrayList <String> (); // variable name as Serial No.
          S_305.add ("305");
          S_305.add ("591");
          S_305.add ("1. electric press");
          S_305.add ("Name");
          S_305.add ("each");
          S_305.add ("");
          S_305.add ("");
          S_305.add ("");


          ArrayList <String> S_306 = new ArrayList <String> ();
          S_306.add ("306");
          S_306.add ("");
          S_306.add ("2. heater");
          S_306.add ("Name");
          S_306.add ("each");
          S_306.add ("");
          S_306.add ("");
          S_306.add ("");



          ArrayList <String> S_307 = new ArrayList <String> (); // variable name as Serial No.
          S_307.add ("307");
          S_307.add ("");
          S_307.add ("3.Toaster");
          S_307.add ("Name");
          S_307.add ("each");
          S_307.add ("");
          S_307.add ("");
          S_307.add ("");


          ArrayList <String> S_308 = new ArrayList <String> ();
          S_308.add ("308");
          S_308.add ("");
          S_308.add ("4. Oven");
          S_308.add ("Name");
          S_308.add ("each");
          S_308.add ("");
          S_308.add ("");
          S_308.add ("");



          ArrayList <String> S_309 = new ArrayList <String> (); // variable name as Serial No.
          S_309.add ("309");
          S_309.add ("592");
          S_309.add ("give other electrical appliances (name) -food cooking / household use");
          S_309.add ("Induction stove (Maharaja white line) / give other name");
          S_309.add ("each");
          S_309.add ("");
          S_309.add ("");
          S_309.add ("");


          ArrayList <String> S_310 = new ArrayList <String> ();
          S_310.add ("310");
          S_310.add ("924");
          S_310.add ("mixer");
          S_310.add ("Mention name");
          S_310.add ("each");
          S_310.add ("");
          S_310.add ("");
          S_310.add ("");

          List<ArrayList<String>> Electronics_Utensils_others= new ArrayList<ArrayList<String>>();     //289-299
          Electronics_Utensils_others.add(S_289);
          Electronics_Utensils_others.add(S_290);
          Electronics_Utensils_others.add(S_291);
          Electronics_Utensils_others.add(S_292);
          Electronics_Utensils_others.add(S_293);
          Electronics_Utensils_others.add(S_294);
          Electronics_Utensils_others.add(S_295);
          Electronics_Utensils_others.add(S_296);
          Electronics_Utensils_others.add(S_297);
          Electronics_Utensils_others.add(S_298);
          Electronics_Utensils_others.add(S_299);
          Electronics_Utensils_others.add(S_300);
          Electronics_Utensils_others.add(S_301);
          Electronics_Utensils_others.add(S_302);
          Electronics_Utensils_others.add(S_303);
          Electronics_Utensils_others.add(S_304);
          Electronics_Utensils_others.add(S_305);
          Electronics_Utensils_others.add(S_306);
          Electronics_Utensils_others.add(S_307);
          Electronics_Utensils_others.add(S_308);
          Electronics_Utensils_others.add(S_309);
          Electronics_Utensils_others.add(S_310);



          ArrayList <String> S_311 = new ArrayList <String> (); // variable name as Serial No.
          S_311.add ("311");
          S_311.add ("600");
          S_311.add ("bicycle");
          S_311.add ("Hero / Avon / Name");
          S_311.add ("each");
          S_311.add ("");
          S_311.add ("");
          S_311.add ("");


          ArrayList <String> S_312 = new ArrayList <String> ();
          S_312.add ("312");
          S_312.add ("601");
          S_312.add ("1. Motor Cycle");
          S_312.add ("Hero Honda / Name");
          S_312.add ("each");
          S_312.add ("");
          S_312.add ("");
          S_312.add ("");



          ArrayList <String> S_313 = new ArrayList <String> (); // variable name as Serial No.
          S_313.add ("313");
          S_313.add ("");
          S_313.add ("2. scooter");
          S_313.add ("Name Bajaj");
          S_313.add ("each");
          S_313.add ("");
          S_313.add ("");
          S_313.add ("");


          ArrayList <String> S_314 = new ArrayList <String> ();
          S_314.add ("314");
          S_314.add ("602");
          S_314.add ("1. motor car");
          S_314.add ("Maruti 800 / others (name)");
          S_314.add ("each");
          S_314.add ("");
          S_314.add ("");
          S_314.add ("");



          ArrayList <String> S_315 = new ArrayList <String> (); // variable name as Serial No.
          S_315.add ("315");
          S_315.add ("");
          S_315.add ("2. jeep");
          S_315.add ("Marshall");
          S_315.add ("each");
          S_315.add ("");
          S_315.add ("");
          S_315.add ("");


          ArrayList <String> S_316 = new ArrayList <String> ();
          S_316.add ("316");
          S_316.add ("603");
          S_316.add ("Tires & Tubes");
          S_316.add ("Mention name");
          S_316.add ("each");
          S_316.add ("");
          S_316.add ("");
          S_316.add ("");



          ArrayList <String> S_317 = new ArrayList <String> (); // variable name as Serial No.
          S_317.add ("317");
          S_317.add ("610");
          S_317.add ("1. Stone Eye");
          S_317.add ("Mention name");
          S_317.add ("each");
          S_317.add ("");
          S_317.add ("");
          S_317.add ("");


          ArrayList <String> S_318 = new ArrayList <String> ();
          S_318.add ("318");
          S_318.add ("");
          S_318.add ("2. Hearing machine / prosthesis (handicapped device)");
          S_318.add ("Mention name");
          S_318.add ("each");
          S_318.add ("");
          S_318.add ("");
          S_318.add ("");



          ArrayList <String> S_319 = new ArrayList <String> (); // variable name as Serial No.
          S_319.add ("319");
          S_319.add ("620");
          S_319.add ("1. Wall Clock");
          S_319.add ("Ajanta / others");
          S_319.add ("each");
          S_319.add ("");
          S_319.add ("");
          S_319.add ("");


          ArrayList <String> S_320 = new ArrayList <String> ();
          S_320.add ("320");
          S_320.add ("");
          S_320.add ("2. Wristwatches");
          S_320.add ("HMT / Others");
          S_320.add ("each");
          S_320.add ("");
          S_320.add ("");
          S_320.add ("");



          ArrayList <String> S_321 = new ArrayList <String> (); // variable name as Serial No.
          S_321.add ("321");
          S_321.add ("622");
          S_321.add ("personal computer");
          S_321.add ("Mention name");
          S_321.add ("each");
          S_321.add ("");
          S_321.add ("");
          S_321.add ("");


          ArrayList <String> S_322 = new ArrayList <String> ();
          S_322.add ("322");
          S_322.add ("623");
          S_322.add ("Mobile Phone Set");
          S_322.add ("Nokia / others (name)");
          S_322.add ("each");
          S_322.add ("");
          S_322.add ("");
          S_322.add ("");



          ArrayList <String> S_323 = new ArrayList <String> (); // variable name as Serial No.
          S_323.add ("323");
          S_323.add ("630");
          S_323.add ("Cleaning equipment in bathrooms");
          S_323.add ("Name");
          S_323.add ("each");
          S_323.add ("");
          S_323.add ("");
          S_323.add ("");


          ArrayList <String> S_324 = new ArrayList <String> ();
          S_324.add ("324");
          S_324.add ("631");
          S_324.add ("1.plug");
          S_324.add ("enc / other");
          S_324.add ("each");
          S_324.add ("");
          S_324.add ("");
          S_324.add ("");



          ArrayList <String> S_325 = new ArrayList <String> (); // variable name as Serial No.
          S_325.add ("325");
          S_325.add ("");
          S_325.add ("2. electrical switch");
          S_325.add ("enc / other");
          S_325.add ("each");
          S_325.add ("");
          S_325.add ("");
          S_325.add ("");


          ArrayList <String> S_326 = new ArrayList <String> ();
          S_326.add ("326");
          S_326.add ("460");
          S_326.add ("3. electric bulb");
          S_326.add ("filips / others");
          S_326.add ("each");
          S_326.add ("");
          S_326.add ("");
          S_326.add ("");



          ArrayList <String> S_327 = new ArrayList <String> (); // variable name as Serial No.
          S_327.add ("327");
          S_327.add ("");
          S_327.add ("4. Tubelight");
          S_327.add ("Phillips / others");
          S_327.add ("each");
          S_327.add ("");
          S_327.add ("");
          S_327.add ("");


          ArrayList <String> S_328 = new ArrayList <String> ();
          S_328.add ("328");
          S_328.add ("");
          S_328.add ("1. MBBS");
          S_328.add ("");
          S_328.add ("per");
          S_328.add ("");
          S_328.add ("");
          S_328.add ("");



          ArrayList <String> S_329 = new ArrayList <String> (); // variable name as Serial No.
          S_329.add ("329");
          S_329.add ("");
          S_329.add ("2. Homoeopathic BHMS");
          S_329.add ("");
          S_329.add ("per");
          S_329.add ("");
          S_329.add ("");
          S_329.add ("");

          ArrayList <String> S_330 = new ArrayList <String> ();
          S_330.add ("330");
          S_330.add ("");
          S_330.add ("3. Ayurveda B.A.M.S.");
          S_330.add ("per");
          S_330.add ("per");
          S_330.add ("");
          S_330.add ("");
          S_330.add ("");



          ArrayList <String> S_331 = new ArrayList <String> (); // variable name as Serial No.
          S_331.add ("331");
          S_331.add ("");
          S_331.add ("X-ray fees");
          S_331.add ("per");
          S_331.add ("per");
          S_331.add ("");
          S_331.add ("");
          S_331.add ("");


          ArrayList <String> S_332 = new ArrayList <String> ();
          S_332.add ("332");
          S_332.add ("");
          S_332.add ("1. MBBS");
          S_332.add ("");
          S_332.add ("per");
          S_332.add ("");
          S_332.add ("");
          S_332.add ("");



          ArrayList <String> S_333 = new ArrayList <String> (); // variable name as Serial No.
          S_333.add ("333");
          S_333.add ("");
          S_333.add ("2. Homoeopathic BHMS");
          S_333.add ("");
          S_333.add ("per");

          S_333.add ("");
          S_333.add ("");
          S_333.add ("");


          ArrayList <String> S_334 = new ArrayList <String> ();
          S_334.add ("334");
          S_334.add ("602");
          S_334.add ("3. Ayurveda B.A.M.S.");
          S_334.add ("per");
          S_334.add ("per");
          S_334.add ("");
          S_334.add ("");
          S_334.add ("");



          ArrayList <String> S_335 = new ArrayList <String> (); // variable name as Serial No.
          S_335.add ("335");
          S_335.add ("");
          S_335.add ("X-ray fees");
          S_335.add ("per");
          S_335.add ("per");
          S_335.add ("");
          S_335.add ("");
          S_335.add ("");


          ArrayList <String> S_336 = new ArrayList <String> ();
          S_336.add ("336");
          S_336.add ("");
          S_336.add ("ECG");
          S_336.add ("Normal");
          S_336.add ("per");
          S_336.add ("");
          S_336.add ("");
          S_336.add ("");



          ArrayList <String> S_337 = new ArrayList <String> (); // variable name as Serial No.
          S_337.add ("337");
          S_337.add ("");
          S_337.add ("Blood Fees");
          S_337.add ("normal");
          S_337.add ("per");
          S_337.add ("");
          S_337.add ("");
          S_337.add ("");


          ArrayList <String> S_338 = new ArrayList <String> ();
          S_338.add ("338");
          S_338.add ("");
          S_338.add ("Aspirin");
          S_338.add ("");
          S_338.add ("per 10 tablets");
          S_338.add ("");
          S_338.add ("");
          S_338.add ("");



          ArrayList <String> S_339 = new ArrayList <String> (); // variable name as Serial No.
          S_339.add ("339");
          S_339.add ("");
          S_339.add ("Paracetamol  ");
          S_339.add (" ");
          S_339.add ("per 10 tablets");
          S_339.add ("");
          S_339.add ("");
          S_339.add ("");


          ArrayList <String> S_340 = new ArrayList <String> ();
          S_340.add ("340");
          S_340.add ("");
          S_340.add ("Antibiotics");
          S_340.add ("name");
          S_340.add ("per 10 tablets");
          S_340.add ("");
          S_340.add ("");
          S_340.add ("");

          ArrayList <String> S_341 = new ArrayList <String> (); // variable name as Serial No.
          S_341.add ("341");
          S_341.add ("");
          S_341.add ("Cough Syrup");
          S_341.add ("Benadryl 114 ml");
          S_341.add ("per syrup");
          S_341.add ("");
          S_341.add ("");
          S_341.add ("");


          ArrayList <String> S_342 = new ArrayList <String> ();
          S_342.add ("342");
          S_342.add ("");
          S_342.add ("Capsule");
          S_342.add ("amoxicillin 250 mg");
          S_342.add ("capsule");
          S_342.add ("");
          S_342.add ("");
          S_342.add ("");



          ArrayList <String> S_343 = new ArrayList <String> (); // variable name as Serial No.
          S_343.add ("343");
          S_343.add ("");
          S_343.add ("Maternity Fees");
          S_343.add ("Hospital/nursing home");
          S_343.add ("per");
          S_343.add ("");
          S_343.add ("");
          S_343.add ("");


          ArrayList <String> S_344 = new ArrayList <String> ();
          S_344.add ("344");
          S_344.add ("405");
          S_344.add ("Primary level");
          S_344.add ("");
          S_344.add ("monthly");
          S_344.add ("");
          S_344.add ("");
          S_344.add ("");



          ArrayList <String> S_345 = new ArrayList <String> (); // variable name as Serial No.
          S_345.add ("345");
          S_345.add ("");
          S_345.add ("JU level");
          S_345.add ("");
          S_345.add ("monthly");
          S_345.add ("");
          S_345.add ("");
          S_345.add ("");


          ArrayList <String> S_346 = new ArrayList <String> ();
          S_346.add ("346");
          S_346.add ("");
          S_346.add ("Intermediate Level");
          S_346.add ("High school and inter");
          S_346.add ("monthly");
          S_346.add ("");
          S_346.add ("");
          S_346.add ("");



          ArrayList <String> S_347 = new ArrayList <String> (); // variable name as Serial No.
          S_347.add ("347");
          S_347.add ("");
          S_347.add ("Higher Education");
          S_347.add ("");
          S_347.add ("monthly");
          S_347.add ("");
          S_347.add ("");
          S_347.add ("");


          ArrayList <String> S_348 = new ArrayList <String> ();
          S_348.add ("348");
          S_348.add ("400");
          S_348.add ("Primary level");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");
          S_348.add ("");



          ArrayList <String> S_349 = new ArrayList <String> (); // variable name as Serial No.
          S_349.add ("349");
          S_349.add ("");
          S_349.add ("JU level");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");
          S_349.add ("");


          ArrayList <String> S_350 = new ArrayList <String> ();
          S_350.add ("350");
          S_350.add ("");
          S_350.add ("Intermediate Level");
          S_350.add ("High School and Inter");
          S_350.add ("");
          S_350.add ("");
          S_350.add ("");
          S_350.add ("");



          ArrayList <String> S_351 = new ArrayList <String> (); // variable name as Serial No.
          S_351.add ("351");
          S_351.add ("");
          S_351.add ("Higher Education");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");
          S_351.add ("");


          ArrayList <String> S_352 = new ArrayList <String> ();
          S_352.add ("352");
          S_352.add ("404");
          S_352.add ("Copy");
          S_352.add ("64 pages");
          S_352.add ("per dozen");
          S_352.add ("");
          S_352.add ("");
          S_352.add ("");



          ArrayList <String> S_353 = new ArrayList <String> (); // variable name as Serial No.
          S_353.add ("353");
          S_353.add ("");
          S_353.add ("Register");
          S_353.add ("2 seat");
          S_353.add ("Per dozen");
          S_353.add ("");
          S_353.add ("");
          S_353.add ("");


          ArrayList <String> S_354 = new ArrayList <String> ();
          S_354.add ("354");
          S_354.add ("");
          S_354.add ("Ball Pen");
          S_354.add ("Cello/Reynolds");
          S_354.add ("Per ten");
          S_354.add ("");
          S_354.add ("");
          S_354.add ("");



          ArrayList <String> S_355 = new ArrayList <String> (); // variable name as Serial No.
          S_355.add ("355");
          S_355.add ("");
          S_355.add ("Pencil");
          S_355.add ("");
          S_355.add ("Per ten");
          S_355.add ("");
          S_355.add ("");
          S_355.add ("");


          ArrayList <String> S_356 = new ArrayList <String> ();
          S_356.add ("356");
          S_356.add ("");
          S_356.add ("4 School Dress");
          S_356.add ("Medium");
          S_356.add ("Per");
          S_356.add ("");
          S_356.add ("");
          S_356.add ("");



          ArrayList <String> S_357 = new ArrayList <String> (); // variable name as Serial No.
          S_357.add ("357");
          S_357.add ("1");
          S_357.add ("Brick");
          S_357.add ("Per 1000");
          S_357.add ("");
          S_357.add ("");
          S_357.add ("");
          S_357.add ("");


          ArrayList <String> S_358 = new ArrayList <String> ();
          S_358.add ("358");
          S_358.add ("2");
          S_358.add ("Rebar (Sariya)");
          S_358.add ("Per quintal");
          S_358.add ("");
          S_358.add ("");
          S_358.add ("");
          S_358.add ("");




          ArrayList <String> S_359 = new ArrayList <String> (); // variable name as Serial No.
          S_359.add ("359");
          S_359.add ("3");
          S_359.add ("Cement");
          S_359.add ("Per 50 kg");
          S_359.add ("");
          S_359.add ("");
          S_359.add ("");
          S_359.add ("");


          ArrayList <String> S_360 = new ArrayList <String> ();
          S_360.add ("360");
          S_360.add ("4");
          S_360.add ("Sand");
          S_360.add ("Desi White");
          S_360.add ("Per 100 square feet");
          S_360.add ("");
          S_360.add ("");
          S_360.add ("");

          ArrayList <String> S_361 = new ArrayList <String> ();
          S_361.add ("361");
          S_361.add ("5");
          S_361.add ("Maurang");
          S_361.add ("Red");
          S_361.add ("Per 100 square feet");
          S_361.add ("");
          S_361.add ("");
          S_361.add ("");


          ArrayList <String> S_362 = new ArrayList <String> ();
          S_362.add ("362");
          S_362.add ("6");
          S_362.add ("Paint");
          S_362.add ("Name");
          S_362.add ("Per Kilogramme");
          S_362.add ("");
          S_362.add ("");
          S_362.add ("");







          List<ArrayList<String>> General_traffic_resource= new ArrayList<ArrayList<String>>();
          General_traffic_resource.add(S_311);
          General_traffic_resource.add(S_312);
          General_traffic_resource.add(S_313);
          General_traffic_resource.add(S_314);
          General_traffic_resource.add(S_315);
          General_traffic_resource.add(S_316);
          General_traffic_resource.add(S_317);
          General_traffic_resource.add(S_318);
          General_traffic_resource.add(S_319);
          General_traffic_resource.add(S_320);
          General_traffic_resource.add(S_321);
          General_traffic_resource.add(S_322);
          General_traffic_resource.add(S_323);
          General_traffic_resource.add(S_324);
          General_traffic_resource.add(S_325);
          General_traffic_resource.add(S_326);
          General_traffic_resource.add(S_327);

          List<ArrayList<String>> Medical_one_Doctor_advice_fees_at_the_clinic= new ArrayList<ArrayList<String>>();
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_328);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_329);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_330);
          Medical_one_Doctor_advice_fees_at_the_clinic.add(S_331);



          List<ArrayList<String>> house_going_fee= new ArrayList<ArrayList<String>>();
          house_going_fee.add(S_332);
          house_going_fee.add(S_333);
          house_going_fee.add(S_334);
          house_going_fee.add(S_335);
          house_going_fee.add(S_336);
          house_going_fee.add(S_337);
          house_going_fee.add(S_338);
          house_going_fee.add(S_339);
          house_going_fee.add(S_340);
          house_going_fee.add(S_341);
          house_going_fee.add(S_342);
          house_going_fee.add(S_343);



          List<ArrayList<String>>Educational_expense= new ArrayList<ArrayList<String>>();
          Educational_expense.add(S_344);
          Educational_expense.add(S_245);
          Educational_expense.add(S_346);
          Educational_expense.add(S_347);

          List<ArrayList<String>> Copy_set= new ArrayList<ArrayList<String>>();
          Copy_set.add(S_348);
          Copy_set.add(S_349);
          Copy_set.add(S_350);
          Copy_set.add(S_351);

          List<ArrayList<String>> Stationary= new ArrayList<ArrayList<String>>();
          Stationary.add(S_352);
          Stationary.add(S_353);
          Stationary.add(S_354);
          Stationary.add(S_355);
          Stationary.add(S_356);


          List<ArrayList<String>> accommodation= new ArrayList<ArrayList<String>>();
          accommodation.add(S_357);
          accommodation.add(S_358);
          accommodation.add(S_359);
          accommodation.add(S_360);
          accommodation.add(S_361);
          accommodation.add(S_362);


          switch(i) {

               case 0: return Foods;
               case 1: return Substance;
               case 2: return Fuel;
               case 3: return Clothing;
               case 4: return Shoes;
               case 5: return Entertainment_And_Other;
               case 6:return Other_Beauty_Product;
               case 7: return Utensils;
               case 8: return Services;
               case 9: return Transportation_Services;
               case 10: return Rent_And_Loan;
               case 11: return Other_home_services;
               case 12: return Jewelry;
               case 13: return Electronics_Utensils_others;
               case 14:return General_traffic_resource;
               case 15: return Medical_one_Doctor_advice_fees_at_the_clinic;
               case 16: return house_going_fee;
               case 17: return Educational_expense;
               case 18: return Copy_set;
               case 19: return Stationary ;
               case 20: return accommodation;
               default: List<ArrayList<String>> empt = new ArrayList<ArrayList<String>>(0);
                    return empt;
          }

     }


     List<String> head_rural_sector(){

          List<String> heading = new ArrayList<String>();
          heading.add("Foods");
          heading.add("Substance");
          heading.add("Fuel");
          heading.add("Clothing");
          heading.add("Shoes");
          heading.add("Entertainment And Other");
          heading.add("Other Beauty Product");
          heading.add("Utensils");
          heading.add("Services");
          heading.add("Transportation Services");
          heading.add("Rent And Loan");
          heading.add("Other home services");
          heading.add("Jewelry");
          heading.add("Electronics Utensils others");
          heading.add("General traffic resource");
          heading.add("Medical one Doctor advice fees at the clinic");
          heading.add("Medical Service at Home fees");
          heading.add("Educational expense");
          heading.add("Copy set");
          heading.add("Stationary");
          heading.add("Accommodation");

          return  heading;

     }

     List<String> getCatogeries()
     {
          List<String> Eatable = new ArrayList<String>();
          Eatable.add("Serials and its Production and Other Services");
          Eatable.add("Meat and Fish");
          Eatable.add("Egg");
          Eatable.add("Milk");
          Eatable.add("Eatable Oil");
          Eatable.add("Fruits and Mewa");
          Eatable.add("Vegetables and Pickles");
          Eatable.add("Pulses");
          Eatable.add("Sugar, Honey, etc");
          Eatable.add("Salt and Spices");
          Eatable.add("Tea and Coffee");
          Eatable.add("Chai Nasta and Jalpan");
          Eatable.add("Smoking");
          Eatable.add("Clothes");
          Eatable.add("Shoes,Slipers, etc");
          Eatable.add("House Rent/ Garage Rent");
          Eatable.add("Electricity and Fuel");
          Eatable.add("Furnitur, Electronics and Other");
          Eatable.add("Medicines");
          Eatable.add("Telecom, Transport and Other");
          Eatable.add("Entertainment");
          Eatable.add("Stationary");
          Eatable.add("Others");

          return Eatable;
     }


}
