package com.xworkz.district.external;

import com.xworkz.district.internal.District;
import com.xworkz.district.internal.House;
import com.xworkz.district.internal.Village;

public class DistrictRunner {

        public static void main(String[] args) {
            District distric = new District();
            House[] housenumber1 = {new House("khushi", "taj", "brudavan", "raashi")};
            House[] housenumber2 = {new House("kushi", "home", "sattva", "vilas")};
            House[] housenumber3 = {new House("brudavan", "sapthgiri", "lakshmi", "garden")};
            House[] housenumber4 = {new House("gardan", "sattva", "raashi", "vilas")};

            Village firstVillage = new Village("shimoga", 22, housenumber1);
            Village secondVillage = new Village("chithradurga", 2000, housenumber2);
            Village thirdvillage = new Village("davangere", 300, housenumber3);
            Village fourthvillage = new Village("mysore", 100000, housenumber4);
            Village[] villages = {firstVillage, secondVillage, thirdvillage, fourthvillage};
            distric.displayDistrict(villages);
        }


    }

