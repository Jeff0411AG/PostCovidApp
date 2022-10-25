package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Doctor;


import java.util.List;

public interface IdoctorService {

    public void insert(Doctor doctor);
    List<Doctor>list();
    public void delete(int idDoctor);
    public List<Doctor> search(String nameDoctor);

}
