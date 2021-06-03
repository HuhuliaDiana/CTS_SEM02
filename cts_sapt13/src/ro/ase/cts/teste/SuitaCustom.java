package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses({ AllTests.class, TestGrupa.class, TestGrupaCUFixture.class, TestPromovabilitateCuFake.class,
		TestPromovabilitateCuStub.class })
//@IncludeCategory({GetPromovabilitateCategory.class})
@ExcludeCategory({TesteNormale.class,TesteUrgente.class})//rulate toate testele mai putin normal si urgente, pt includecategory comentat
public class SuitaCustom {

}
