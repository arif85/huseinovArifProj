package IskustnicaPackNew;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                RegistrationPageSamovivozV2.class,
                RegistrationPageKuryeromMoskvaV2.class,
                RegistrationPageKuryeromMoskvockayaOblastV2.class,
                RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroyV2.class,
                RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDomV2.class,
                RegistrationPageNegativeTestV2.class


        }
)
public class TestSuiteRegistrationOnIskustnicaRuV2 {

}
