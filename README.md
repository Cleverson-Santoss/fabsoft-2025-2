# fabsoft-2025-2.

Cleverson Santos

Sistema para controle de estoque de materiais

Funcionalidade 1: Cadastrar Materiais, Cadastrar Empresa, Cadastrar Dados dos Materias.

Funcionalidade 2: Consultar Materiais, Consultar Empresa, Consultar Dados dos Materias.

Funcionalidades 3: Alterar Materias, Alterar Empresa, Alterar Dados dos Materiais.

# Historias de Usuário

Cadastro de Material

    Como um usuário do sistema, eu gostaria de cadastrar nome, código, descrição, categoria, unidade de medida e preço (ou custo) de um material.

    Como um usuário do sistema, eu gostaria que o sistema valide os campos obrigatórios no cadastro.

    Como um usuário do sistema, eu gostaria que o sistema informe uma mensagem confirmando o cadastro.

Atualização de Material

    Como um usuário do sistema, eu gostaria de que o sistema permita buscar e selecionar um material existente.

    Como um usuário do sistema, eu gostaria de que o sistema exibas os dados do material selecionado.

    Como um usuário do sistema, eu gostaria de que o sistema permita alterar os campos dos dados do material e salvar as alterações.

Consulta de Material

    Como um usuário do sistema, eu gostaria de que o sistema permita realizar buscas por nome ou código de materiais cadastrados.

    Como um usuário do sistema, eu gostaria de que o sistema exiba o resultado da busca, exibindo os dados do material.

Validação de Dados do Cadastro

    Como um usuário do sistema, eu gostaria de que o sistema não permita cadastro de código de material repetido.

    Como um usuário do sistema, eu gostaria de que o sistema informe caso ocorra um erro de preenchimento.


---
Diagrama de Entidades
---
```mermaid

classDiagram
   
    Empresa "1" --> "*" Categoria
    Empresa "1" --> "*" Material
    Categoria "1" --> "*" Material

    namespace entity {
     class Empresa {
          -id : long
          -nome : String
          -cnpj : String
          -endereco : String
          -telefone : String

          +getId() long
          +setId(id:long) void
          +getNome() String
          +setNome(nome:String) void
          +getCnpj() String
          +setCnpj(cnpj:String) void
          +getEndereco() String
          +setEndereco(endereco:String) void
          +getTelefone() String
          +setTelefone(telefone:String) void 
     }    

      class Categoria {
          -id : long
          -nome : String
          -descricao : String

          +getId() long
          +setId(id:long) void
          +getNome() String
          +setNome(nome:String) void
          +getDescricao() String
          +setDescricao(descricao:String) void
      }

      class Material {
          -id : long
          -codigo : String
          -nome : String
          -descricao : String
          -categoria : Categoria

          +getId() long
          +setId(id:long) void
          +getCodigo() String
          +setCodigo(codigo:String) void
          +getNome() String
          +setNome(nome:String) void
          +getDescricao() String
          +setDescricao(descricao:String) voidd
          +getCategoria() Categoria
          +setCategoria(categoria:Categoria) void
      }
    }


