package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.categorii.CategorieBoundery;
import teste.categorii.CategorieUtilizareFAke;
import teste.test.TestAgentieCuDubluri;
import teste.test.TestPachetTuristic;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieCuDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFAke.class)
@Categories.ExcludeCategory(CategorieBoundery.class)
public class SuitaTesteCuFakeuri {

}
