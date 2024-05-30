// import java.util.ArrayList;

// /**
//  * The test class for PenguinFamily class
//  *
//  * @author Hanlu Shi
//  * @version ver 2.1
//  */
// public class PenguinFamilyTest {
//     public static void main(String[] args) {
        // // Test default constructor
        // PenguinFamily penguinFamily1 = new PenguinFamily();
        // System.out.println("Test 1");
        // if (penguinFamily1.getFamilyEggs().isEmpty())
        // {
        //     System.out.println("familyEggs ArrayList: empty");
        // }
        // if (penguinFamily1.getMalePenguin() != null)
        // {
        //     System.out.println("male penguin: not null");
        // }
        // if (penguinFamily1.getFemalePenguin() != null)
        // {
        //     System.out.println("female penguin: not null");
        // }
        // if (penguinFamily1.getIdCode().isEmpty())
        // {
        //     System.out.println("idCode: empty");
        // }

        // // Test non-default constructor with valid field values
        // System.out.println("Test 2");
        // PenguinFamily penguinFamily2 = new PenguinFamily();
        // Chick chick1 = new Chick();
        // Chick chick2 = new Chick();
        // ArrayList<Chick> chicks = new ArrayList<>();
        // chicks.add(chick1);
        // chicks.add(chick2);
        // penguinFamily2.setFamilyChicks(chicks);

        // Egg egg1 = new Egg();
        // Egg egg2 = new Egg();
        // ArrayList<Egg> eggs = new ArrayList<>();
        // eggs.add(egg1);
        // eggs.add(egg2);
        // penguinFamily2.setFamilyEggs(eggs);

        // Penguin malePenguin = new Penguin();
        // Penguin femalePenguin = new Penguin();
        // penguinFamily2.setMalePenguin(malePenguin);
        // penguinFamily2.setFemalePenguin(femalePenguin);

        // penguinFamily2.setIdCode("P002");

        // if (penguinFamily2.getFamilyChicks().size() == 2)
        // {
        //     System.out.println("familyChicks ArrayList: 2");
        // }
        // if (penguinFamily2.getFamilyEggs().size() == 2)
        // {
        //     System.out.println("familyEggs ArrayList: 2");
        // }
        // if (penguinFamily2.getMalePenguin() == malePenguin)
        // {
        //     System.out.println("male penguin: not null");
        // }
        // if (penguinFamily2.getFemalePenguin() == femalePenguin)
        // {
        //     System.out.println("female penguin: not null");
        // }
        // if (penguinFamily2.getIdCode().equals("P002"))
        // {
        //     System.out.println("idCode: P002");
        // }

        // // Test non-default constructor with invalid values
        // System.out.println("Test 3");
        // // Step 1: Create an object of PenguinFamily with the non-constructor with invalid values
        // ArrayList<Chick> familyChicks = new ArrayList<>();
        // ArrayList<Egg> familyEggs = new ArrayList<>();
        // Penguin femalePenguin2 = new Penguin();
        // String idCode = "P002";
        // Penguin malePenguin2 = new Penguin();

        // // Set the number of eggs to -3 (invalid value)
        // int numberOfEggs = -3;

        // // Modify the number of eggs based on validity
        // if (numberOfEggs >= 0) {
        //     for (int i = 0; i < numberOfEggs; i++)
        //     {
        //         familyEggs.add(new Egg());
        //     }
        // } else {
        //     // Handle the invalid input
        //     System.out.println("Invalid number of eggs: " + numberOfEggs);
        // }

        // PenguinFamily penguinFamily3 = new PenguinFamily(familyChicks, familyEggs, femalePenguin2, idCode, malePenguin2);

        // // Step 2: Verify the expected results
        // int expectedChicksSize = 0; // No chicks added
        // int expectedEggsSize = 0;   // No eggs added
        // String expectedIdCode = "P002";

        // if (penguinFamily3.getFamilyChicks().size() == expectedChicksSize &&
        //         penguinFamily3.getFamilyEggs().size() == expectedEggsSize &&
        //         penguinFamily3.getFemalePenguin() != null &&
        //         penguinFamily3.getMalePenguin() != null &&
        //         penguinFamily3.getIdCode().equals(expectedIdCode)) {
        //     System.out.println("Test passed!");
        // } else {
        //     System.out.println("Test failed!");
        // }

        // // Test non-default constructor with invalid field values
        // PenguinFamily penguinFamily4= new PenguinFamily();
        // System.out.println("Test 4");
        // int invalidIndex = -1;
        // Penguin invalidChick = penguinFamily4.getSpecificChick(invalidIndex);
        // if (invalidChick == null)
        // {
        //     System.out.println("null");
        // }

        // // Comment the above codes before the following tests
        // // Test get methods
        // PenguinFamily penguinFamily5 = new PenguinFamily();
        // Chick chick1 = new Chick();
        // Chick chick2 = new Chick();
        // ArrayList<Chick> chicks = new ArrayList<>();
        // chicks.add(chick1);
        // chicks.add(chick2);
        // penguinFamily5.setFamilyChicks(chicks);

        // Egg egg1 = new Egg();
        // Egg egg2 = new Egg();
        // ArrayList<Egg> eggs = new ArrayList<>();
        // eggs.add(egg1);
        // eggs.add(egg2);
        // penguinFamily5.setFamilyEggs(eggs);

        // Penguin malePenguin = new Penguin();
        // Penguin femalePenguin = new Penguin();
        // penguinFamily5.setMalePenguin(malePenguin);
        // penguinFamily5.setFemalePenguin(femalePenguin);

        // penguinFamily5.setIdCode("P005");
        // System.out.println("Test 5");
        // if (penguinFamily5.getFamilyChicks().size() == 2)
        // {
        //     System.out.println("getFamilyChicks Test passed!");
        // }
        // System.out.println("Test 6");
        // if (penguinFamily5.getFamilyEggs().size() == 2)
        // {
        //     System.out.println("getFamilyEggs Test passed!");
        // }
        // System.out.println("Test 7");
        // if (penguinFamily5.getFemalePenguin() == femalePenguin)
        // {
        //     System.out.println("getFemalePenguin Test passed!");
        // }
        // System.out.println("Test 8");
        // if (penguinFamily5.getIdCode().equals("P005"))
        // {
        //     System.out.println("getIdCode Test passed!");
        // }
        // System.out.println("Test 9");
        // if (penguinFamily5.getMalePenguin() == malePenguin)
        // {
        //     System.out.println("getMalePenguin Test passed!");
        // }

        // // Test non-default constructor with invalid field values
        // PenguinFamily penguinFamily6 = new PenguinFamily();

        // // Test set methods
        // // Test setFamilyChicks with valid field values
        // System.out.println("Test10");
        // Chick chick3 = new Chick();
        // ArrayList<Chick> newChicks = new ArrayList<>();
        // newChicks.add(chick3);
        // penguinFamily6.setFamilyChicks(newChicks);
        // if (penguinFamily6.getFamilyChicks().size() == 1)
        // {
        //     System.out.println("setFamilyChicks with valid Test passed!");
        // }

        // System.out.println("Test11");
        // // Test setFamilyChicks with invalid field values
        // penguinFamily6.setFamilyChicks(null);
        // if (penguinFamily6.getFamilyChicks() == null)
        // {
        //     System.out.println("setFamilyChicks with invalid Test passed!");
        // }

        // System.out.println("Test12");
        // // Test setFamilyEggs with valid field values
        // Egg egg3 = new Egg();
        // ArrayList<Egg> newEggs = new ArrayList<>();
        // newEggs.add(egg3);
        // penguinFamily6.setFamilyEggs(newEggs);
        // if (penguinFamily6.getFamilyEggs().size() == 1)
        // {
        //     System.out.println("setFamilyEggs with valid Test passed!");
        // }

        // System.out.println("Test13");
        // // Test setFamilyEggs with invalid field values
        // penguinFamily6.setFamilyEggs(null);
        // if (penguinFamily6.getFamilyEggs() == null)
        // {
        //     System.out.println("setFamilyEggs with invalid Test passed!");
        // }

        // System.out.println("Test14");
        // // Test setFemalePenguin with valid field values
        // Penguin newFemalePenguin = new Penguin();
        // penguinFamily6.setFemalePenguin(newFemalePenguin);
        // if (penguinFamily6.getFemalePenguin() == newFemalePenguin)
        // {
        //     System.out.println("setFemalePenguin with valid Test passed!");
        // }

        // System.out.println("Test15");
        // // Test setFemalePenguin with invalid field values
        // penguinFamily6.setFemalePenguin(null);
        // if (penguinFamily6.getFemalePenguin() == null)
        // {
        //     System.out.println("setFemalePenguin with invalid Test passed!");
        // }

        // System.out.println("Test16");
        // // Test setIdCode with valid field values
        // penguinFamily6.setIdCode("P003");
        // if (penguinFamily6.getIdCode().equals("P003"))
        // {
        //     System.out.println("setIdCode with valid Test passed!");
        // }

        // System.out.println("Test17");
        // // Test setIdCode with invalid field values
        // penguinFamily6.setIdCode(null);
        // if (penguinFamily6.getIdCode() == null)
        // {
        //     System.out.println("setIdCode with invalid Test passed!");
        // }

        // System.out.println("Test18");
        // // Test setMalePenguin with valid field values
        // Penguin newMalePenguin = new Penguin();
        // penguinFamily6.setMalePenguin(newMalePenguin);
        // if (penguinFamily6.getMalePenguin() == newMalePenguin)
        // {
        //     System.out.println("setMalePenguin with valid Test passed!");
        // }

        // System.out.println("Test19");
        // // Test setMalePenguin with invalid field values
        // penguinFamily6.setMalePenguin(null);
        // if (penguinFamily6.getMalePenguin() == null)
        // {
        //     System.out.println("setMalePenguin with invalid Test passed!");
        // }

        // Comment the above codes before testing
        // Test breedEggsAndAlive() Method
        // Test Case 1: Both male and female penguins are alive
        // Penguin malePenguin3 = new Penguin('M');
        // Penguin femalePenguin3 = new Penguin('F');
        // ArrayList<Egg> familyEggs = new ArrayList<>();
        // ArrayList<Chick> familyChicks = new ArrayList<>();
        // PenguinFamily penguinFamily7 = new PenguinFamily();

    //     // Set the male penguin and female pengui aliveFlag to true
    //     penguinFamily7.getFemalePenguin().setAliveFlag(true);
    //     penguinFamily7.getMalePenguin().setAliveFlag(true);
    //     int numberOfNewEggs = penguinFamily7.breedEggsAndAlive();
    //     int expectedMinEggs = 0;
    //     int expectedMaxEggs = 2;

    //     if (numberOfNewEggs >= expectedMinEggs && numberOfNewEggs <= expectedMaxEggs &&
    //             numberOfNewEggs == penguinFamily7.getFamilyEggs().size())
    //     {
    //         System.out.println("Test Case 1: Passed");
    //         System.out.println("The number of eggs added to familyEggs list matches the returned value.");
    //     }
    //     else
    //     {
    //         System.out.println("Test Case 1: Failed");
    //     }

    //     // Test Case 2: Both male and female penguins are not alive
    //     Penguin malePenguin4 = new Penguin('M');

    //     Penguin femalePenguin4 = new Penguin('F');

    //     ArrayList<Egg> familyEggs2 = new ArrayList<>();
    //     ArrayList<Chick> familyChicks2 = new ArrayList<>();

    //     PenguinFamily penguinFamily8 = new PenguinFamily(familyChicks2, familyEggs2, femalePenguin4, "P008", malePenguin4);
    //     penguinFamily8.getFemalePenguin().setAliveFlag(false);
    //     penguinFamily8.getMalePenguin().setAliveFlag(false);
    //     int numberOfNewEggs2 = penguinFamily8.breedEggsAndAlive();

    //     if (numberOfNewEggs2 == 0)
    //     {
    //         System.out.println("Test Case 2: Passed.\nreturns 0");
    //     }
    //     else
    //     {
    //         System.out.println("Test Case 2: Failed\return 0");
    //     }

    //     // Test Case 3: Female penguin is not alive
    //     Penguin malePenguin5 = new Penguin();
    //     Penguin femalePenguin5 = new Penguin();
    //     ArrayList<Egg> familyEggs3 = new ArrayList<>();
    //     ArrayList<Chick> familyChicks3 = new ArrayList<>();
    //     PenguinFamily penguinFamily9 = new PenguinFamily(familyChicks3, familyEggs3, femalePenguin5, "P009", malePenguin5);
    //     penguinFamily9.getFemalePenguin().setAliveFlag(false);
    //     int numberOfNewEggs3 = penguinFamily9.breedEggsAndAlive();

    //     if (numberOfNewEggs3 == 0)
    //     {
    //         System.out.println("Test Case 3: Passed.\nreturn 0");
    //     } else {
    //         System.out.println("Test Case 3: Failed");
    //     }


//         // Test display() methods
//         Penguin malePenguin6 = new Penguin('M');
//         Penguin femalePenguin6 = new Penguin('F');

//         ArrayList<Egg> familyEggs4 = new ArrayList<>();
//         familyEggs4.add(new Egg());
//         familyEggs4.add(new Egg());

//         ArrayList<Chick> familyChicks4 = new ArrayList<>();
//         familyChicks4.add(new Chick());
//         familyChicks4.add(new Chick());
//         familyChicks4.add(new Chick());

//         PenguinFamily penguinFamily10 = new PenguinFamily(familyChicks4, familyEggs4, femalePenguin6, "P010", malePenguin6);

//         penguinFamily10.display();


//     }
// }
