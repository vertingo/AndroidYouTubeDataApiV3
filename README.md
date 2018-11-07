
Ci-dessous regroupement des différents cours sur Android:
+ <a href="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Pdf_De_Formation_Utiles/AndroidStudioDiapo.pdf" target="_blank">Pdf sur les bases d'Android Studio!</a>
+ <a href="https://github.com/vertingo/PDFViewerAndScreenshot" target="_blank">Système d'aperçu de fichier PDF et capture d'écran!</a> 
+ <a href="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Pdf_De_Formation_Utiles/Pdf_MyListAdapter.pdf" target="_blank">Création d'un menu sous forme de liste adaptable en fonction de la taille des items afficher!</a> 
+ <a href="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Pdf_De_Formation_Utiles/DeploiementEtApk.pdf" target="_blank">Comment générer et deployer un fichier APK signé sur Android Studio!</a>


Intégrer Data API V3 You Tube dans votre Application Android 
1)Importation du YouTube Android Player à votre projet Android! 
Télécharger le fichier .JAR à l'adresse suivante: https://developers.google.com/youtube/android/player/downloads/YouTubeAndroidPlayerApi-1.2.2.zip 
Dézipper le contenu et dans votre projet Android en sélectionnant le dossier app + clic droit dans votre arborescence de votre projet à gauche! 
Faites New → Module → Import an existing JAR package → Sélectionner le fichier .JAR du YouTube Android Player télécharger normalement appelé : YouTubeAndroidPlayerApi-1.2.2.zip

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/Android_Library.png"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android Ajouter également les dépendances à votre projet en cliquant sur File → Project Structure:

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/Project%20Structure.png"/></a>
</p>

Et ensuite ajouter les dépendances à votre projet comme illustrer ci-dessous!

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/Project%20Structure%20Dependancy.png"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android Récupérer votre clé API sur Google Cloud Platform!(Créer un Projet si ce n'est pas déjà fait!)

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store.jpg"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android Récupérer votre clé API sur Google Cloud Platform!(Créer un Projet si ce n'est pas déjà fait!)

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store2.jpg"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android Rendez-vous dans le menu Identifiants puis Créer des identifiants!

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store3.jpg"/></a>
</p>

Sélectionner dans le sous-menu Créer des identifiants → Clé Api 

![alt tag](http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/app-store4.jpg)

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store4.jpg"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android Cliquer sur restreindre la clé!

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store5.jpg"/></a>
</p>
  
Intégrer Data API V3 You Tube dans votre Application Android 
Choisir Application Android, indiquer nom de package et empreinte de certification SHA-1(Indication sur l'image suivante), puis enregistrer!


<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store7.jpg"/></a>
</p>

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/EmpreinteSHA-1.gif"/></a>
</p>


Intégrer Data API V3 You Tube dans votre Application Android Ouvrir une invite de commande dans le dossier suivant:                 
C:\Program Files\Android\Android Studio\jre\jre\bin\keytool Chemin vers le fichier debug.keystore: C:\Users\Username\.android\debug.keystore Mot de passe demandé : android

<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="http://vertin-go.com/Fonctions_Annexes/annexes/pdt-page-de-telechargement/Android_You_Tube_Data_API/Images/app-store8.jpg"/></a>
</p>

```
Un petit coup de pouce suivez nous sur YouTube et Facebook!
[You Tube] ==> https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1 
[Facebook] ==> https://www.facebook.com/vertingo/ 
```
  
<p align="center">
  <a href="https://www.youtube.com/channel/UC2g_-ipVjit6ZlACPWG4JvA?sub_confirmation=1"><img src="https://platform-media.herokuapp.com/assets/images/reseaux-sociaux/youtube2.png" width="400" height="250"/></a>
  <a href="https://www.facebook.com/vertingo/"><img src="https://platform-media.herokuapp.com/assets/images/reseaux-sociaux/rejoins_nous.png" width="400" height="250"/></a>
</p>


