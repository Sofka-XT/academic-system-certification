Feature: Como usuario quiero navegar al modulo buzz
  para dar clic al Most liked posts
  y poder elegir un post para darle like; comentarlo; y compartirlo

  Scenario: dar like, comentar y compartir post con chrome
    Given el usuario necesita comertar,compartir dar like, inicia sesion el usuario Admin, con la contraseña admin123
    When  abro el tercer post mas comentado del modulo buzz
    Then podre dar like, comentar: La vida es elegir, puedes elegir ser una víctima o cualquier otra cosa que te propongas. EL GUERRERO PACÍFICO y compartir