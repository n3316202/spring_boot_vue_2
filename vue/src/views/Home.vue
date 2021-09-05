<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld msg="안녕하세요 Vue.js 앱입니다." />
  </div>
</template>

<script>
  import HelloWorld from '@/components/HelloWorld.vue'
  
  export default {
    name: 'home',
    components: {
      HelloWorld
    }
  };
</script>
