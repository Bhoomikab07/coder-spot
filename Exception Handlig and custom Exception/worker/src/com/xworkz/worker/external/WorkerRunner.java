package com.xworkz.worker.external;

import com.xworkz.worker.internal.Worker;

public class WorkerRunner {

        public static void main(String[] args) {
            Worker employee = new Worker();
            employee.salary(55.999);
            //employee.employee(32.999)

            employee.colleagues(3);
            //employee.colleagues(0);

            employee.work("good");
            //employee.work("bad");

            employee.experience(2.5f);
            //employee.experience(1.2f);

            employee.salary(true);
            //employee.gf(false);
        }
    }


