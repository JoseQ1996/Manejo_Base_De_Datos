PGDMP             	            w            MiBaseDeDatos    11.4    11.4 
               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16393    MiBaseDeDatos    DATABASE     �   CREATE DATABASE "MiBaseDeDatos" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
    DROP DATABASE "MiBaseDeDatos";
             postgres    false            �            1259    16402 	   DIRECCION    TABLE     �   CREATE TABLE public."DIRECCION" (
    "DIR_CODIGO" numeric NOT NULL,
    "DIR_CALLE_PRINCIPAL" text,
    "DIR_CALLE_SECUNDARIA" text,
    "DIR_NUMERO" numeric(3,0),
    "DIR_CEDULA_PER" text
);
    DROP TABLE public."DIRECCION";
       public         postgres    false            �            1259    16394    PERSONA    TABLE     �   CREATE TABLE public."PERSONA" (
    "PER_CEDULA" text NOT NULL,
    "PER_NOMBRE" text,
    "PER_APELLIDO" text,
    "PER_EDAD" numeric(3,0),
    "PER_FECHA_NACIMIENTO" date,
    "PER_CELULAR" text,
    "PER_SALARIO" numeric(7,2)
);
    DROP TABLE public."PERSONA";
       public         postgres    false            �
          0    16402 	   DIRECCION 
   TABLE DATA               �   COPY public."DIRECCION" ("DIR_CODIGO", "DIR_CALLE_PRINCIPAL", "DIR_CALLE_SECUNDARIA", "DIR_NUMERO", "DIR_CEDULA_PER") FROM stdin;
    public       postgres    false    197   �
       �
          0    16394    PERSONA 
   TABLE DATA               �   COPY public."PERSONA" ("PER_CEDULA", "PER_NOMBRE", "PER_APELLIDO", "PER_EDAD", "PER_FECHA_NACIMIENTO", "PER_CELULAR", "PER_SALARIO") FROM stdin;
    public       postgres    false    196   +       �
           2606    16409    DIRECCION DIRECCION_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."DIRECCION"
    ADD CONSTRAINT "DIRECCION_pkey" PRIMARY KEY ("DIR_CODIGO");
 F   ALTER TABLE ONLY public."DIRECCION" DROP CONSTRAINT "DIRECCION_pkey";
       public         postgres    false    197            �
           2606    16401    PERSONA PERSONA_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."PERSONA"
    ADD CONSTRAINT "PERSONA_pkey" PRIMARY KEY ("PER_CEDULA");
 B   ALTER TABLE ONLY public."PERSONA" DROP CONSTRAINT "PERSONA_pkey";
       public         postgres    false    196            �
   J   x�3�t�+�,,M��M���46�40604�047��2�tLJL��I,JO�45C�2J�p:�e&'�I��qqq �}�      �
   S   x����  �w;�@(�H�&4�5���J��5�1^[�l��s�g��-�z�ˀ�@��v�!�K I�#���̯�     