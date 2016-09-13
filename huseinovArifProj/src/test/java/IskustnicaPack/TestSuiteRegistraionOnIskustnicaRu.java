package IskustnicaPack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                RegistrationPageSamovivoz.class,
                RegistrationPageKuryeromMoskva.class,
                RegistrationPageKuryeromMoskvockayaOblast.class,
                RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroy.class,
                RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDom.class


        }
)
public class TestSuiteRegistraionOnIskustnicaRu {

}
