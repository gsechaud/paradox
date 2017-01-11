lazy val main = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
    paradoxTheme := None
  )