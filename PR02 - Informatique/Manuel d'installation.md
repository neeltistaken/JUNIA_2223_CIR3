# Manuel d'installation

Vous pouvez retrouver dans ce document l'ensemble des conditions nécessaires pour charger les sources du projet.

## Prérequis

À minima, il est demandé d'avoir sur l'ordinateur les programmes suivants : 

- NodeJS **19.4.0** (includes npm 9.2.0)

Dans la racine du projet, tapez la commande suivante dans un terminal `*sh` pour installer l'ensemble des dépendances nécessaires au bon usage du programme. 

```bash
npm i
```

### Changement de serveur

Les liens de routes présents dans le projet pointe vers le serveur de démonstration `XX.XXX.XXX.XX:3000`, vous pouvez changer pour faire tourner le projet en local en remplaçant les IP par `http://localhost:3000`.

### Base de données

La BDD est hébérgée sur un serveur distant. Vous pouvez utiliser la version hébergée ou recréer votre propre instance (pensez à changer le pointage dans le programme).

Voici l'arborescence de la base de donnée :

L'organisation est fournie "en l'état", sans garantie d'aucune sorte, expresse ou implicite qu'elle soit utilisée dans cette configuration.

#### USER

| Variable | Type | Détail |
| -------------- | ------ | --------------------------------------------- |
| `id` | Int | |
| `admin` | Int | 1 si administrateur, 2 si superadministrateur |
| `login` | String | |
| `password` | String | |
| `list_circuit` | Tab | Id des circuits |

#### Circuits

| Variable | Type | Détail |
| ---------------- | ---- | -------------- |
| `id` | Int | |
| `list_points` | Tab | Id des points |
| `type` | Int | |
| `title` | Int | |
| `author` | Int | Id de l'auteur |
| `historique`[^2] | | |

#### Points

| Variable | Type | Détail |
| ---------------- | ------ | ------------- |
| `id` | Int | |
| `titre` | Bool | |
| `description` | String | |
| `image` | | |
| `video` | | |
| `quizz` | | |
| `historique`[^2] | Map | |
| `circuit` | Int | Id du circuit |

[^2]: `map(mail, object(nb_passage; [heure]))`

## Lancement

Pour démarrer le projet, tapez l'une des deux commandes suivantes dans la racine du projet : 

```bash
npm start
$ ou
node ./bin/www
```

Le serveur sera lancé sur le port 3000.

Les identifiants par défaut sont les suivants :

| Libellé           | Token            |
| ----------------- | ---------------- |
| Nom d'utilisateur | `theo@gmail.com` |
| Mot de passe      | `test`           |
²
## Licence

Ce code contient des accès extrêmement confidentiels notamment pour la gestion de la base de données ou du serveur mail. L'équipe vous demande la plus grande vigiliance quant à la diffusion de ses informations.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.