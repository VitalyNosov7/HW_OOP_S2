package clinic;

public class Doctor extends MedicalStaff {



    public Doctor(String name, PersonnelCategory personnelCategory, String speciality,  Nurse nurse){
        super(name,  personnelCategory,  speciality);
      
    }

    public void giveTaskToStaff(String nameDoctor, String nameNurse){
    
        System.out.printf("%s %s  даёт распоряжения сотруднику %s%n",this.TYPE, nameDoctor, nameNurse);
    }

} 