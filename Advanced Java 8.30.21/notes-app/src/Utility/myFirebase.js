import {initializeApp} from 'firebase/app';
import {getDatabase, ref} from 'firebase/database';

const firebaseConfig = {
    apiKey: "AIzaSyBKEuoGNVELBW9di1ffCko4uLM4vArlS6E",
    authDomain: "ttsproject-d7f44.firebaseapp.com",
    databaseURL: "https://ttsproject-d7f44-default-rtdb.firebaseio.com",
    projectId: "ttsproject-d7f44",
    storageBucket: "ttsproject-d7f44.appspot.com",
    messagingSenderId: "717107593622",
    appId: "1:717107593622:web:6e94c5f80137937d0cddb7",
    measurementId: "G-WP3V7NC3TX"
  };


  initializeApp(firebaseConfig);

  function getFireBaseRef(refPath) {
      return ref(getDatabase(), refPath);
  }

  export default {
      getFireBaseRef: getFireBaseRef
  };