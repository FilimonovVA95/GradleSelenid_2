package company.name.character.testers;

import company.name.enums.TesterCareer;
import company.name.enums.TesterEducation;

public class TesterForC809 extends AbstractTester {

    public TesterForC809() {
        stand = getPreprodStand();
        email = "gateyo4034@mailsecv.com";
        password = "OQFf1j";
        isRegistration = true;

        fioProfile = "Михаил Васильевич Ломоносов";
        dataBirth = "21.12.2000";
        address = "Москва";
        isMan = true;
        isMarried = true;
        education = TesterEducation.SECONDARY_VOCATIONAL;
        career = TesterCareer.SPECIALIST_HIGHER_EDUCATION_WITHOUT_SUBMISSIONS;
        income = "5 000";
        children = 1;
    }
}
