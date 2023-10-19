<h1 align="center">Iphone Component Diagram</h1>

<p align="center">🚀 Modeling and diagramming of the UML representation and code regarding the iPhone component.</p>


```mermaid
classDiagram
  class Iphone {
    + tocar()
    + pausar()
    + selecionarMusica()
    + ligar()
    + atender()
    + iniciarCorreioVoz()
    + exibirPagina()
    + adicionarNovaAba()
    + atualizarPagina()
  }

  class RepodutorMusicial {
    + tocar()
    + pausar()
    + selecionarMusica()
  }

  class AparelhoTelefonico {
    + ligar()
    + atender()
    + iniciarCorreioVoz()
  }

  class NavegadorInternet {
    + exibirPagina()
    + adicionarNovaAba()
    + atualizarPagina()
  }

  Iphone --|> RepodutorMusicial
  Iphone --|> AparelhoTelefonico
  Iphone --|> NavegadorInternet
```
<p>Project part of <a href="https://web.dio.me/">DIO</a> Bootcamp FullStack - Java + Angular </p>

### 🛠 Technologies
[![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=&logoColor=30A3DC)](https://docs.github.com/)
