PaqueteProyectores pp = new PaqueteProyectores(1, "Martin", "Mendoza", 2.0);

@Test
public void declara_cod_paquete_de_proyectores() {
  Assert.assertTrue(pp.getClass().getDeclaredFields("codPaqueteDeProyectores"));
}