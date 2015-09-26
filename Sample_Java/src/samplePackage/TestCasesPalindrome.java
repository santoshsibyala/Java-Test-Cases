package samplePackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCasesPalindrome {

        @Test 
        public  void reverseStringPositiveTestCase1(){
                String inputString = "amanaplanacanalpanama";
                String expectedOutPut = "amanaplanacanalpanama";
                Palindrome reverseUtils = new Palindrome();
                String actualOutPut = reverseUtils.reverse(inputString);

                Reporter.log("The reversed string is :" + actualOutPut,true);

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public  void reverseStringSpecialCharacterTestCase1(){

                String inputString = "ama!naplanacanalpan!ama";
                String expectedOutPut = "ama!naplanacanalpan!ama";
                Palindrome reverseUtils = new Palindrome();
                String actualOutPut = reverseUtils.reverse(inputString);

                Reporter.log("The reversed string is :" + actualOutPut,true);

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public  void reverseStringNullTestCase1(){

                String inputString = null;
                String expectedOutPut = null;
                Palindrome reverseUtils = new Palindrome();
                String actualOutPut = reverseUtils.reverse(inputString);

                Reporter.log("The reversed string is :" + actualOutPut,true);

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }

        @Test
        public  void reverseStringEmptyStringTestCase1(){

                String inputString = "";
                String expectedOutPut = "";
                Palindrome reverseUtils = new Palindrome();
               String actualOutPut = reverseUtils.reverse(inputString);

               Reporter.log("The reversed string is :" + actualOutPut,true);

                Assert.assertEquals(actualOutPut, expectedOutPut);

        }









}
