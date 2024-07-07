# Plugin de Suporte a eSIM para Cordova

Este projeto desenvolve um plugin Cordova que permite verificar o suporte a eSIM (SIM embutido) em dispositivos iOS e Android. O objetivo é fornecer uma solução fácil de usar para desenvolvedores que precisam verificar a compatibilidade de dispositivos móveis com eSIM em suas aplicações híbridas. O plugin é escrito em Swift para a plataforma iOS e em Java para a plataforma Android.

## Funcionalidades

- **Verificação de Suporte a eSIM em iOS:** Utiliza as APIs do CoreTelephony para verificar se o dispositivo suporta a provisão de planos celulares via eSIM.
- **Verificação de Suporte a eSIM em Android:** Utiliza as APIs do SubscriptionManager para verificar se o dispositivo pode gerenciar assinaturas de eSIM.
- **Interface Simples:** Inclui uma aplicação front-end básica para testar a funcionalidade do plugin com um único clique.

## Tecnologias Utilizadas

- **Cordova:** Framework de desenvolvimento de aplicações móveis híbridas.
- **Swift:** Linguagem de programação usada para desenvolver o plugin para dispositivos iOS.
- **Java:** Linguagem de programação usada para desenvolver o plugin para dispositivos Android.

## Estrutura do Projeto

\`\`\`
esimPlugin/
│
├── src/
│   ├── ios/
│   │   └── ESIMSupport.swift
│   │
│   └── android/
│       └── ESIMSupport.java
│
├── www/
│   └── ESIMSupport.js
│
├── plugin.xml
├── package.json
└── README.md
\`\`\`

## Instruções de Instalação

Estas instruções irão ajudá-lo a obter uma cópia do projeto em funcionamento na sua máquina local para fins de desenvolvimento e teste.

### Pré-requisitos

Você precisa ter Node.js, npm e Cordova instalados no seu sistema. Node.js e npm podem ser instalados a partir de [nodejs.org](https://nodejs.org/). Após instalar o Node.js, você pode instalar o Cordova usando npm:

\`\`\`bash
npm install -g cordova
\`\`\`

### Instalando

Para configurar o projeto na sua máquina local, siga estes passos:

1. **Clone o Repositório:**
   \`\`\`bash
   git clone https://github.com/ruifrcosta/eSIM_Plugin
   cd eSIM_Plugin/esimApp
   \`\`\`

2. **Adicionar Plataformas:**
   \`\`\`bash
   cordova platform add ios      # Para iOS
   cordova platform add android  # Para Android
   \`\`\`

3. **Construir o Projeto:**
   \`\`\`bash
   cordova build ios      # Para iOS
   cordova build android  # Para Android
   \`\`\`

4. **Executar a Aplicação:**
   \`\`\`bash
   cordova run ios      # Em um dispositivo ou simulador iOS
   cordova run android  # Em um dispositivo ou emulador Android
   \`\`\`

## Como Usar

Para testar o suporte a eSIM, simplesmente abra a aplicação e clique no botão "Check eSIM Support". O resultado será exibido na tela, indicando se o dispositivo suporta eSIM ou não.

## Contribuição

Sinta-se à vontade para contribuir com este projeto. Você pode abrir issues para relatar bugs ou solicitar funcionalidades, bem como enviar pull requests com melhorias e correções.

## Autor

**Rui Costa** - ruifrcosta (https://github.com/ruifrcosta)

## Agradecimentos

- Agradecimentos a qualquer pessoa cujo código foi utilizado
- Inspiração
- etc
